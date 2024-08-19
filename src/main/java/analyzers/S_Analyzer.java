
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analyzers;

import logic.TError;
import java_cup.runtime.Symbol;
import java.util.LinkedList;
import com.mycompany.practica1.errorReport;
import com.mycompany.practica1.reports;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class S_Analyzer extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Symbols.class;
}

  /** Default constructor. */
  @Deprecated
  public S_Analyzer() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public S_Analyzer(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public S_Analyzer(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\013\002\000\002\003\006\000\002\003\003\000" +
    "\002\004\016\000\002\005\020\000\002\006\022\000\002" +
    "\007\005\000\002\007\005\000\002\007\005\000\002\010" +
    "\020\000\002\011\003\000\002\011\002\000\002\012\003" +
    "\000\002\012\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\121\000\004\012\006\001\002\000\004\002\123\001" +
    "\002\000\004\013\105\001\002\000\010\017\010\020\007" +
    "\021\011\001\002\000\004\010\066\001\002\000\004\010" +
    "\051\001\002\000\004\010\012\001\002\000\004\022\014" +
    "\001\002\000\004\013\ufff3\001\002\000\004\025\015\001" +
    "\002\000\006\010\020\024\017\001\002\000\014\004\026" +
    "\005\024\006\025\007\023\025\034\001\002\000\016\004" +
    "\ufff9\005\ufff9\006\ufff9\007\ufff9\011\ufff9\025\ufff9\001\002" +
    "\000\006\010\020\024\017\001\002\000\014\004\026\005" +
    "\024\006\025\007\023\011\ufffb\001\002\000\004\011\033" +
    "\001\002\000\006\010\020\024\017\001\002\000\006\010" +
    "\020\024\017\001\002\000\006\010\020\024\017\001\002" +
    "\000\006\010\020\024\017\001\002\000\016\004\uffff\005" +
    "\uffff\006\025\007\023\011\uffff\025\uffff\001\002\000\016" +
    "\004\ufffc\005\ufffc\006\ufffc\007\ufffc\011\ufffc\025\ufffc\001" +
    "\002\000\016\004\ufffe\005\ufffe\006\025\007\023\011\ufffe" +
    "\025\ufffe\001\002\000\016\004\ufffd\005\ufffd\006\ufffd\007" +
    "\ufffd\011\ufffd\025\ufffd\001\002\000\016\004\ufffa\005\ufffa" +
    "\006\ufffa\007\ufffa\011\ufffa\025\ufffa\001\002\000\006\010" +
    "\020\024\017\001\002\000\014\004\026\005\024\006\025" +
    "\007\023\025\036\001\002\000\006\010\020\024\017\001" +
    "\002\000\014\004\026\005\024\006\025\007\023\025\040" +
    "\001\002\000\006\010\020\024\017\001\002\000\014\004" +
    "\026\005\024\006\025\007\023\025\042\001\002\000\006" +
    "\010\020\024\017\001\002\000\014\004\026\005\024\006" +
    "\025\007\023\025\044\001\002\000\004\023\045\001\002" +
    "\000\004\011\046\001\002\000\006\012\006\013\ufff0\001" +
    "\002\000\004\013\ufff6\001\002\000\004\013\ufff1\001\002" +
    "\000\004\022\053\001\002\000\004\013\ufff5\001\002\000" +
    "\004\025\054\001\002\000\006\010\020\024\017\001\002" +
    "\000\014\004\026\005\024\006\025\007\023\025\056\001" +
    "\002\000\006\010\020\024\017\001\002\000\014\004\026" +
    "\005\024\006\025\007\023\025\060\001\002\000\006\010" +
    "\020\024\017\001\002\000\014\004\026\005\024\006\025" +
    "\007\023\025\062\001\002\000\004\023\063\001\002\000" +
    "\004\011\064\001\002\000\006\012\006\013\ufff0\001\002" +
    "\000\004\013\ufff8\001\002\000\004\022\070\001\002\000" +
    "\004\013\ufff4\001\002\000\004\025\071\001\002\000\006" +
    "\010\020\024\017\001\002\000\014\004\026\005\024\006" +
    "\025\007\023\025\073\001\002\000\006\010\020\024\017" +
    "\001\002\000\014\004\026\005\024\006\025\007\023\025" +
    "\075\001\002\000\006\010\020\024\017\001\002\000\014" +
    "\004\026\005\024\006\025\007\023\025\077\001\002\000" +
    "\006\010\020\024\017\001\002\000\014\004\026\005\024" +
    "\006\025\007\023\025\101\001\002\000\004\023\102\001" +
    "\002\000\004\011\103\001\002\000\006\012\006\013\ufff0" +
    "\001\002\000\004\013\ufff7\001\002\000\004\014\106\001" +
    "\002\000\004\015\107\001\002\000\004\010\110\001\002" +
    "\000\004\016\111\001\002\000\004\025\112\001\002\000" +
    "\006\010\020\024\017\001\002\000\014\004\026\005\024" +
    "\006\025\007\023\025\114\001\002\000\006\010\020\024" +
    "\017\001\002\000\014\004\026\005\024\006\025\007\023" +
    "\025\116\001\002\000\006\010\020\024\017\001\002\000" +
    "\014\004\026\005\024\006\025\007\023\011\120\001\002" +
    "\000\006\002\uffee\012\006\001\002\000\004\002\ufff2\001" +
    "\002\000\004\002\uffef\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\121\000\006\007\004\010\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\066" +
    "\001\001\000\004\004\051\001\001\000\004\006\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\015\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\020\001\001\000\004\013\021\001\001" +
    "\000\002\001\001\000\004\003\031\001\001\000\004\003" +
    "\030\001\001\000\004\003\027\001\001\000\004\003\026" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\003\034" +
    "\001\001\000\002\001\001\000\004\003\036\001\001\000" +
    "\002\001\001\000\004\003\040\001\001\000\002\001\001" +
    "\000\004\003\042\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\007\047\011\046\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\054\001\001" +
    "\000\002\001\001\000\004\003\056\001\001\000\002\001" +
    "\001\000\004\003\060\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\007\047\011\064\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\003\071\001\001\000\002\001" +
    "\001\000\004\003\073\001\001\000\002\001\001\000\004" +
    "\003\075\001\001\000\002\001\001\000\004\003\077\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\007\047\011\103\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\112\001\001\000" +
    "\002\001\001\000\004\003\114\001\001\000\002\001\001" +
    "\000\004\003\116\001\001\000\002\001\001\000\010\007" +
    "\004\010\121\012\120\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$S_Analyzer$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$S_Analyzer$actions(this);
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
    return action_obj.CUP$S_Analyzer$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public String result="";

    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {        
        String lexeme = s.value.toString();
        int line = s.right;
        int column = s.left;
        
        System.out.println("! Error Sintactico Recuperado !");
        System.out.println("\t\tLexema: "+ lexeme);
        System.out.println("\t\tFila: "+ line);
        System.out.println("\t\tColumna: "+ column);

        TError data = new TError(lexeme,line,column,"Sintactico","Caracter no esperado");
        errorReport.TableErrors.add(data);
       
        
    }

    //Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {        
        String lexeme = s.value.toString();
        int line = s.right;
        int column = s.left;
        
        System.out.println("! Error Sintactico, PANIC MODE ! ");
        System.out.println("\t\tLexema: "+lexeme);
        System.out.println("\t\tFila: "+line);
        System.out.println("\t\tColumna: "+column);

        TError data = new TError(lexeme,line,column,"Sintactico","Caracter no esperado");
        errorReport.TableErrors.add(data);
     
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$S_Analyzer$actions {



  private final S_Analyzer parser;

  /** Constructor */
  CUP$S_Analyzer$actions(S_Analyzer parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$S_Analyzer$do_action_part00000000(
    int                        CUP$S_Analyzer$act_num,
    java_cup.runtime.lr_parser CUP$S_Analyzer$parser,
    java.util.Stack            CUP$S_Analyzer$stack,
    int                        CUP$S_Analyzer$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$S_Analyzer$result;

      /* select the action based on the action number */
      switch (CUP$S_Analyzer$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= F EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).value;
		RESULT = start_val;
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$S_Analyzer$parser.done_parsing();
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= E 
            {
              String RESULT =null;

              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // A ::= A plus A 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 int val1= Integer.parseInt(a);
                    int val2= Integer.parseInt(b);
                    double r = val1+val2;
                    RESULT = String.valueOf(r); 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // A ::= A minus A 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 int val1= Integer.parseInt(a);
                    int val2= Integer.parseInt(b);
                    double r = val1-val2;
                    RESULT = String.valueOf(r); 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // A ::= A split A 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 int val1= Integer.parseInt(a);
                    int val2= Integer.parseInt(b);
                    double r = val1/val2;
                    RESULT = String.valueOf(r); 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // A ::= A times A 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 int val1= Integer.parseInt(a);
                    int val2= Integer.parseInt(b);
                    double r = val1*val2;
                    RESULT = String.valueOf(r); 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NT$0 ::= 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
 RESULT = a; 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("NT$0",9, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // A ::= paro A NT$0 parc 
            {
              String RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (String) ((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;

              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-3)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // A ::= num 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 RESULT = a; 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // B ::= paro name comma A comma A comma A comma color parc G 
            {
              String RESULT =null;
		int posxleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-8)).left;
		int posxright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-8)).right;
		String posx = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-8)).value;
		int posyleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-6)).left;
		int posyright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-6)).right;
		String posy = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-6)).value;
		int radiusleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-4)).left;
		int radiusright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-4)).right;
		String radius = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-4)).value;
		int colorsleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int colorsright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		Object colors = (Object)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		 System.out.println("Cadena aceptada (Circulo o Cuadrado)");
                                                                                     reports.ColorsList.add(String.valueOf(colors));
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-11)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // C ::= paro name comma A comma A comma A comma A comma color parc G 
            {
              String RESULT =null;
		int colorsleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int colorsright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		Object colors = (Object)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		 System.out.println("Cadena aceptada (Rectangulo o Linea)");
                                                                            reports.ColorsList.add(String.valueOf(colors));
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-13)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // D ::= paro name comma A comma A comma A comma A comma A comma color parc G 
            {
              String RESULT =null;
		int colorsleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int colorsright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		Object colors = (Object)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		 System.out.println("Cadena aceptada (Poligono)");
                                                                                    reports.ColorsList.add(String.valueOf(colors));
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-15)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // E ::= graph shapesone B 
            {
              String RESULT =null;
		int shapeleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).left;
		int shaperight = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).right;
		Object shape = (Object)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).value;
		reports.ObjectsList.add(String.valueOf(shape));
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("E",5, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // E ::= graph shapestwo C 
            {
              String RESULT =null;
		int shapeleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).left;
		int shaperight = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).right;
		Object shape = (Object)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).value;
		reports.ObjectsList.add(String.valueOf(shape));
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("E",5, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // E ::= graph shapesthree D 
            {
              String RESULT =null;
		int shapeleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).left;
		int shaperight = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).right;
		Object shape = (Object)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).value;
		reports.ObjectsList.add(String.valueOf(shape));
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("E",5, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // F ::= E animate object previous paro animation comma A comma A comma A parc H 
            {
              String RESULT =null;
		int animleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-8)).left;
		int animright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-8)).right;
		Object anim = (Object)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-8)).value;
		 System.out.println("Instrucciones completas correctas");
                                                                                    reports.AnimationsList.add(String.valueOf(anim));
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("F",6, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-13)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // G ::= E 
            {
              String RESULT =null;

              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("G",7, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // G ::= 
            {
              String RESULT =null;

              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("G",7, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // H ::= F 
            {
              String RESULT =null;

              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("H",8, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // H ::= 
            {
              String RESULT =null;

              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("H",8, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$S_Analyzer$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$S_Analyzer$do_action(
    int                        CUP$S_Analyzer$act_num,
    java_cup.runtime.lr_parser CUP$S_Analyzer$parser,
    java.util.Stack            CUP$S_Analyzer$stack,
    int                        CUP$S_Analyzer$top)
    throws java.lang.Exception
    {
              return CUP$S_Analyzer$do_action_part00000000(
                               CUP$S_Analyzer$act_num,
                               CUP$S_Analyzer$parser,
                               CUP$S_Analyzer$stack,
                               CUP$S_Analyzer$top);
    }
}

}
