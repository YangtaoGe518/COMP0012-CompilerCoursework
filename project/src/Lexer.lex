import java_cup.runtime.*;

%%
%class Lexer
%public
%unicode
%cup
%line
%column

%{
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
    return "line: " + l + ", column: " + c + ", with: " + yytext();
  }
%}

/* Regex for Marco Definition */

/* WhiteSpace */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

/* comments */ 
Comment = {TraditionalComment} | {EndOfLineComment}

TraditionalComment = "/#" [^#] {CommentContent} "#"+ "/"
EndOfLineComment = "#" {InputCharacter}* {LineTerminator}?
CommentContent = "/#" [^#] ~"#/" | "/#" "#" + "/"

/* Basic */
letter = [A-Za-z]
L = [a-zA-Z_]
digit = [0-9]
alphanumeric = {letter}|{digit}
other_id_char = [_]

identifier = {letter}({alphanumeric}|{other_id_char})*

string = \" ([^\\\"]|\\.)* \"

integer = 0 | [1-9][0-9]*

%%

<YYINITIAL> {

  /* key words */
  "main"                        {return symbol(sym.MAIN);}
  "char"                        {return symbol(sym.CHAR);}
  "int"                         {return symbol(sym.INT);}
  "rat"                         {return symbol(sym.RAT);}
  "float"                       {return symbol(sym.FLOAT);}
  "seq"                         {return symbol(sym.SEQ);}
  "len"                         {return symbol(sym.LEN);}
  "in"                          {return symbol(sym.IN);}
  "bool"                        {return symbol(sym.BOOL);}
  
  "tdef"                        {return symbol(sym.TDEF);}
  "alias"                       {return symbol(sym.ALIAS);}

  "read"                        {return symbol(sym.READ);}
  "print"                       {return symbol(sym.PRINT);}
  "if"                          {return symbol(sym.IF);}
  "fi"                          {return symbol(sym.FI);}
  "then"                        {return symbol(sym.THEN);}
  "else"                        {return symbol(sym.ELSE);}
  "loop"                        {return symbol(sym.LOOP);}
  "pool"                        {return symbol(sym.POOL);}
  "break"                       {return Symbol(sym.BREAK);}
  "return"                      {return symbol(sym.RETURN);}

  /* Literals */
  "F"                           {return symbol(sym.FALSE, new String(yytext()));}
  "T"                           {return symbol(sym.TRUE, new String(yytext()));}

  /* Boolean */
  "!"                           {return symbol(sym.LOGNEGATION);}
  "&&"                          {return symbol(sym.DOUBLEAND);}
  "||"                          {return symbol(sym.OR, new String(yytext()));}

  /* numeric */
  "+"                           {return symbol(sym.PLUS);}
  "-"                           {return symbol(sym.MINUS);}
  "*"                           {return symbol(sym.TIMES);}
  "/"                           {return symbol(sym.DIV);

  /* Separators */
  ";"                           {return symbol(sym.SIMICOLON, new String(yytext()));}
  ":"                           {return symbol(sym.COLON);}
  "::"                          {return symbol(sym.DOUBLECOL);}
  "."                           {return symbol(sym.DOT, new String(yytext()));}

  "["                           {return symbol(sym.LSQRBRK);}
  "]"                           {return symbol(sym.RSQRBRK);}
  "{"                           {return symbol(sym.LBRK, new String(yytext()));}
  "}"                           {return symbol(sym.RBRK, new String(yytext()));}
  "("                           {return symbol(sym.LPAR, new String(yytext()));}
  ")"                           {return symbol(sym.RPAR, new String(yytext()));}

  /* comparision */
  "<"                           {return symbol(sym.LESS, new String(yytext()));}
  "<="                          {return symbol(sym.LESSEQ, new String(yytext()));}
  "=="                          {return symbol(sym.EQ, new String(yytext()));}
  "!="                          {return symbol(sym.NEQ, new String(yytext()));}

  /* Assignment */
  ":="                          {return symbol(sym.ASSIGNMENT, new String(yytext()));}


  /* Others */
  {string}                      {return symbol(sym.STRING_LITERAL, new String(yytext()));}
  {integer}                     {return symbol(sym.INTEGER_LITERAL, new String(yytext()));}

  {identifier}                  {return symbol(sym.IDENTIFIER, new String(yytext()));}

  {WhiteSpace}                  {/* do nothing */}
  {comments}                    {/* do nothing */}
 
}

/* Error Feedback */
[^]  {
  reportError(yyline+1, "Illegal character \" " + yytext() + " \"");
}


