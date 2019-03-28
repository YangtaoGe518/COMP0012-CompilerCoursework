import java_cup.runtime.*;

%%
%class Lexer
%unicode
%cup
%line
%column

%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

/* Regex for Marco Definition */

// WhiteSpace
LineTerminator = \r|\n|\r\n
InputCharacter = [ˆ\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

// comments 
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment = "/*" [ˆ*] {CommentContent} "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}
DocumentationComment = "/**" {CommentContent} "*"+ "/"

CommentContent = ( [ˆ*] | \*+ [ˆ/*] )*


%%
<YYINITIAL> {

  "let"         { return symbol(sym.LET);        }
  {Integer}     { return symbol(sym.INTEGER,
                                Integer.parseInt(yytext())); }
  {Identifier}  { return symbol(sym.IDENTIFIER, yytext());   }

  {Whitespace}  { /* do nothing */               }
  ":="          { return symbol(sym.EQUAL);      }
  ";"           { return symbol(sym.SEMICOL);    }
  "+"           { return symbol(sym.PLUS);       }
  "-"           { return symbol(sym.MINUS);      }
  "*"           { return symbol(sym.MULT);       }
  "/"           { return symbol(sym.DIV);        }
  "("           { return symbol(sym.LPAREN);     }
  ")"           { return symbol(sym.RPAREN);     }

}


/* Error Feedback */
[^]  {
  System.out.println("file:" + (yyline+1) +
    ":0: Error: Invalid input '" + yytext()+"'");
  return symbol(sym.BADCHAR);
}


