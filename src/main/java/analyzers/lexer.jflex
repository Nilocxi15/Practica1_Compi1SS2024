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

    public void printList() {
        System.out.println(TableLE.size());
        for (int i = 1; i <= TableLE.size(); i++) {
            System.out.println(TableLE.get(i-1));
        }
        TableLE.clear();
    }
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
WhiteSpace     = {LineTerminator} | [ \t\f]
NameRules = [A-Za-z] | [0-9] | "_"
Name = {NameRules}+
Color = "azul" | "rojo" | "amarillo" | "verde" | "negro" | "anaranjado" | "morado" | "marron" | "rosado"
ShapesOne = "circulo" | "cuadrado"
ShapesTwo = "rectangulo" | "linea"
ShapesThree = "poligono"
Animation = "línea" | "curva"

//------> Estados

%%

/*------------  3raa Area: Reglas Lexicas ---------*/

//-----> Simbolos

<YYINITIAL> "+"         { System.out.println("Reconocio "+yytext()+" mas"); return new Symbol(Symbols.plus, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "-"         { System.out.println("Reconocio "+yytext()+" menos"); return new Symbol(Symbols.minus, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "*"         { System.out.println("Reconocio "+yytext()+" por"); return new Symbol(Symbols.times, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "/"         { System.out.println("Reconocio "+yytext()+" div"); return new Symbol(Symbols.split, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "("         { System.out.println("Reconocio "+yytext()+" paro"); return new Symbol(Symbols.paro, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> ")"         { System.out.println("Reconocio "+yytext()+" parc"); return new Symbol(Symbols.parc, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> ","         { System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(Symbols.comma, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "graficar"  { System.out.println("Reconocio "+yytext()+" graficar"); return new Symbol(Symbols.graph, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "animar"    { System.out.println("Reconocio "+yytext()+" animar"); return new Symbol(Symbols.animate, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "objeto"    { System.out.println("Reconocio "+yytext()+" objeto"); return new Symbol(Symbols.object, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> "anterior"  { System.out.println("Reconocio "+yytext()+" anterior"); return new Symbol(Symbols.previous, (yycolumn + 1), (yyline + 1), yytext()); }


//-------> Simbolos ER
<YYINITIAL> {Animation} { System.out.println("Reconocio "+yytext()+" animacion"); return new Symbol(Symbols.animation, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> {Color}     { System.out.println("Reconocio "+yytext()+" color"); return new Symbol(Symbols.color, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> {ShapesOne} { System.out.println("Reconocio "+yytext()+" circulo o cuadrado"); return new Symbol(Symbols.shapesone, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> {ShapesTwo} { System.out.println("Reconocio "+yytext()+" rectangulo o linea"); return new Symbol(Symbols.shapestwo, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> {ShapesThree} { System.out.println("Reconocio "+yytext()+" poligono"); return new Symbol(Symbols.shapesthree, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> {number}    { System.out.println("Reconocio "+yytext()+" num"); return new Symbol(Symbols.num, (yycolumn + 1), (yyline + 1), yytext()); }
<YYINITIAL> {Name}    { System.out.println("Reconocio "+yytext()+" nombre"); return new Symbol(Symbols.name, (yycolumn + 1), (yyline + 1), yytext()); }

{WhiteSpace} {/* Ignore */}

//------> Errores Lexicos
.                       { System.out.println("Error Lexico"+yytext()+" Linea "+ (yyline + 1) +" Columna "+ (yycolumn + 1));
                          TError datos = new TError(yytext(),(yyline +1),(yycolumn + 1),"Error Lexico","Simbolo no existe en el lenguaje");
                          TableLE.add(datos);}