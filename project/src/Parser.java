
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\020\000\002\004\003\000\002\002\004\000\002\002" +
    "\004\000\002\002\002\000\002\003\003\000\002\003\003" +
    "\000\002\006\004\000\002\007\003\000\002\007\003\000" +
    "\002\007\005\000\002\007\005\000\002\010\003\000\002" +
    "\010\003\000\002\010\003\000\002\010\003\000\002\005" +
    "\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\014\002\ufffe\004\ufffe\005\ufffe\006\ufffe\015" +
    "\ufffe\001\002\000\014\002\001\004\007\005\014\006\010" +
    "\015\015\001\002\000\004\002\006\001\002\000\004\002" +
    "\000\001\002\000\016\010\ufffa\011\ufffa\012\ufffa\013\ufffa" +
    "\014\ufffa\016\ufffa\001\002\000\004\005\030\001\002\000" +
    "\014\010\027\011\023\012\024\013\021\014\025\001\002" +
    "\000\014\002\ufffd\004\ufffd\005\ufffd\006\ufffd\015\ufffd\001" +
    "\002\000\014\002\uffff\004\uffff\005\uffff\006\uffff\015\uffff" +
    "\001\002\000\016\010\ufff9\011\ufff9\012\ufff9\013\ufff9\014" +
    "\ufff9\016\ufff9\001\002\000\010\004\007\005\014\015\015" +
    "\001\002\000\014\002\ufffc\004\ufffc\005\ufffc\006\ufffc\015" +
    "\ufffc\001\002\000\014\011\023\012\024\013\021\014\025" +
    "\016\022\001\002\000\010\004\007\005\014\015\015\001" +
    "\002\000\010\004\ufff4\005\ufff4\015\ufff4\001\002\000\016" +
    "\010\ufff7\011\ufff7\012\ufff7\013\ufff7\014\ufff7\016\ufff7\001" +
    "\002\000\010\004\ufff6\005\ufff6\015\ufff6\001\002\000\010" +
    "\004\ufff5\005\ufff5\015\ufff5\001\002\000\010\004\ufff3\005" +
    "\ufff3\015\ufff3\001\002\000\016\010\ufff8\011\023\012\024" +
    "\013\021\014\025\016\ufff8\001\002\000\014\002\ufffb\004" +
    "\ufffb\005\ufffb\006\ufffb\015\ufffb\001\002\000\004\007\031" +
    "\001\002\000\010\004\007\005\014\015\015\001\002\000" +
    "\014\002\ufff2\004\ufff2\005\ufff2\006\ufff2\015\ufff2\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\006\002\003\004\004\001\001\000\012\003" +
    "\012\005\011\006\015\007\010\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\016\001\001\000\002\001" +
    "\001\000\004\010\017\001\001\000\004\007\025\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\017\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\006\031\007" +
    "\010\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return lexer.next_token(); 
    }



  public boolean syntaxErrors = false;

  private boolean debug = false;
  public boolean  debug()         {return debug;}
  public void     debug(boolean b){debug = b;}

  static class Node {
    public ArrayList<Node> children;
    private static int globalCounter = 0;

    public int counter;
    private Object value;

    public Node(Object value){
      Node.globalCounter += 1;
      this.counter = Node.globalCounter;
      this.value = value;
      this.children = new ArrayList<Node>();
    }

    public void addChild(Node n){ children.add(n); }

    public String toString(){
      String ret = "";
      ret += String.format("%d [label=\"%s\"];\n",
                            counter, value.toString());
      for(Node n: children){
        ret += String.format("%d -> %d;\n", this.counter, n.counter);
        ret += n.toString();
      }
      return ret;
    }
  }

  private Lexer lexer;

  public Parser(Lexer lex) {
    super(lex);
    lexer = lex;
  }

  public void syntax_error(Symbol current_token) {
    report_error(
      "Syntax error at line " + (current_token.left+1) + ", column "
      + current_token.right + ". ", null
    );
    syntaxErrors = true;
}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // top_level ::= statements 
            {
              Object RESULT =null;
		int ssleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object ss = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                if(debug()) System.out.println((Node)ss);
              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("top_level",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= top_level EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statements ::= statements statement 
            {
              Object RESULT =null;
		int ssleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object ss = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                  Node n = (Node)ss;
                  n.addChild((Node)s);
                  RESULT = n;
               
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statements",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statements ::= 
            {
              Object RESULT =null;
		
                  RESULT = new Node("Statements");
               
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statements",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // statement ::= let_bind 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = (Node)s;
              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // statement ::= full_exp 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = (Node)s;
              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // full_exp ::= simple_exp SEMICOL 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = (Node)e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("full_exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // simple_exp ::= INTEGER 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Node(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // simple_exp ::= IDENTIFIER 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Node(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // simple_exp ::= simple_exp operator simple_exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                  Node n = (Node)o;
                  n.addChild((Node)e1);
                  n.addChild((Node)e2);
                  RESULT = n;
               
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // simple_exp ::= LPAREN simple_exp RPAREN 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
                 Node n = new Node("parens");
                 n.addChild(new Node("("));
                 n.addChild((Node)e);
                 n.addChild(new Node(")"));
                 RESULT = (Node)e;
               
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // operator ::= PLUS 
            {
              Object RESULT =null;
		 RESULT = new Node("+"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // operator ::= MINUS 
            {
              Object RESULT =null;
		 RESULT = new Node("-"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // operator ::= MULT 
            {
              Object RESULT =null;
		 RESULT = new Node("*"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // operator ::= DIV 
            {
              Object RESULT =null;
		 RESULT = new Node("/"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // let_bind ::= LET IDENTIFIER EQUAL full_exp 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
               Node n = new Node("LET");
               n.addChild(new Node(i));
               n.addChild((Node)e);
               RESULT = n;
             
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("let_bind",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}