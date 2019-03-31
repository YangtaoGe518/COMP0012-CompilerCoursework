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

  private void reportError(int line, String msg){
    throw new RuntimeException("Lexical error at line #" + line + ": " + msg);
  }

  public String currentLexeme(){
    int l = yyline + 1;
    int c = yycolumn + 1;
    return "line: " + 1 + ", column: " + c + ", with: " + yytext();
  }
%}

/* Regex for Marco Definition */

/* WhiteSpace */
LineTerminator = \r|\n|\r\n
InputCharacter = [ˆ\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

/* comments */ 
Comment = {TraditionalComment} | {EndOfLineComment}

TraditionalComment = "/#" [ˆ#] {CommentContent} "#"+ "/"
EndOfLineComment = "#" {InputCharacter}* {LineTerminator}
CommentContent = "/#" [^#] ~"#/" | "/#" "#" + "/"

/* Basic */
letter = [A-Za-z]
L = [a-zA-Z_]
digit = [0-9]
alphanumeric = {letter}|{digit}
other_id_char = [_]
identifier = {letter}({alphanumeric}|{other_id_char})*

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
  reportError(yyline+1, "Illegal character \"" + yytext + "\"");
}


