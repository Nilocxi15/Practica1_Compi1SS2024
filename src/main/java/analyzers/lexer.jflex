/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package analyzers;
import java_cup.runtime.*;
import java.util.LinkedList;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%
%{
    //----> Codigo de usuario en sintaxis java
    public static LinkedList<TError> TableLE = new LinkedList<TError>();
%}

//-------> Directivas
%public
%class L_Analyzer
%cupsym Symbols
%cup
%char
%column
%full
%ignorecase
%line

//------> Expresiones Regulares
number = [0-9]+
LineTerminator = \r|\n|\r\n
WhiteSpace     = [ \t\f]
NameRules = [A-Za-z] | [0-9] | "_"
Name = {NameRules}+
//Color = "azul" | "rojo" | "amarillo" | "verde"
//Color2 = "negro" | "anaranjado" | "morado" | "marron" | "rosado"

//------> Estados

%%

/*------------  3raa Area: Reglas Lexicas ---------*/

//-----> Simbolos

<YYINITIAL> "+"         { System.out.println("Reconocio "+yytext()+" mas"); return new Symbol(Symbols.plus, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "-"         { System.out.println("Reconocio "+yytext()+" menos"); return new Symbol(Symbols.minus, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "*"         { System.out.println("Reconocio "+yytext()+" por"); return new Symbol(Symbols.times, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "/"         { System.out.println("Reconocio "+yytext()+" div"); return new Symbol(Symbols.split, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "("         { System.out.println("Reconocio "+yytext()+" para"); return new Symbol(Symbols.paro, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> ")"         { System.out.println("Reconocio "+yytext()+" parc"); return new Symbol(Symbols.parc, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> ","         { System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(Symbols.comma, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "azul"         { System.out.println("Reconocio "+yytext()+" color"); return new Symbol(Symbols.color, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "rojo"         { System.out.println("Reconocio "+yytext()+" color"); return new Symbol(Symbols.color, (yycolumn + 1), (yyline + 1), yytext()); }
//De acá en adelante ya reconoce los colores como si fueran nombres
<YYINITIAL> "amarillo"         { System.out.println("Reconocio "+yytext()+" color"); return new Symbol(Symbols.color, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "verde"         { System.out.println("Reconocio "+yytext()+" color"); return new Symbol(Symbols.color, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "negro"         { System.out.println("Reconocio "+yytext()+" color"); return new Symbol(Symbols.color, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "anaranjado"         { System.out.println("Reconocio "+yytext()+" color"); return new Symbol(Symbols.color, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "morado"         { System.out.println("Reconocio "+yytext()+" color"); return new Symbol(Symbols.color, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "marron"         { System.out.println("Reconocio "+yytext()+" color"); return new Symbol(Symbols.color, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "rosado"         { System.out.println("Reconocio "+yytext()+" color"); return new Symbol(Symbols.color, (yycolumn + 1), (yyline + 1), yytext()); }

//-------> Simbolos ER
<YYINITIAL> {number}    { System.out.println("Reconocio "+yytext()+" num"); return new Symbol(Symbols.num, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> {LineTerminator}    { System.out.println("Reconocio "+yytext()+" salto de linea"); return new Symbol(Symbols.lineterminator, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> {Name}    { System.out.println("Reconocio "+yytext()+" nombre"); return new Symbol(Symbols.name, (yycolumn + 1), (yyline + 1), yytext()); }

{WhiteSpace} {/* Ignore */}

//------> Errores Lexicos
.                       { System.out.println("Error Lexico"+yytext()+" Linea "+ (yyline + 1) +" Columna "+ (yycolumn + 1));
                          TError datos = new TError(yytext(),(yyline +1),(yycolumn + 1),"Error Lexico","Simbolo no existe en el lenguaje");
                          TableLE.add(datos);}