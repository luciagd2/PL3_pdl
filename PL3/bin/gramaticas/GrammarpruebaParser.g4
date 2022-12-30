parser grammar GrammarpruebaParser;

options {
	tokenVocab = GrammarpruebaLexer;
}

@header {
	package gramaticas;

}

//Regla principal
prog: ((expr|asign|func)FIN)*;

//Regla de asignación
asign: LET VAR (IG (expr|func))?
    |       VAR IG (expr|func)
    ;
//Regla expresión -> devuelve uno de los tipos de datos
expr:    PI expr PD
    |    expr EXP expr
    |    expr MULDIVMOD expr
    |    expr SUMRES expr
    |    NUM
    |    TXT
    |    POL
    |    VAR
    |    VAL PI (POL|VAR) (COMA POL COMA (NUM|VAR))* PD
    ;

//Regla con las funciones o llamadas a funciones del lenguaje
func:    PRINT PI expr PD
    |    IF PI logico PD bloq_cod
    |    WHILE PI logico PD bloq_cod
    |    FUNCT VAR declVFunc bloq_cod
    |    VAR vFunc
    ;

//Regla que devuelve valores logicos
logico: expr COMP expr
    |   logico LOG logico
    ;

//Regla con la declaracion de variables de una funcion
declVFunc: PI (VAR(COMA VAR)*)? PD;     //Variables de declaracion a funcion

//Regla con las variables a introducir en una funcion
vFunc: PI (expr(COMA expr)*)? PD;       //Variables de llamada a funcion

//Regla con el bloque de codigo de las func que lo necesitan
bloq_cod: CI sent* retorno? CD;          //Bloque de codigo

//Regla return
retorno: RET(VAR|expr)? FIN;             //Return de una funcion

//Regla sentencia -> componen los bloques de codigo
sent: (asign|expr|func) FIN;            //Sentencias de un bloque de codigo
//Regla de la condicion
condicion: PI(OPNEG)?((expr(COMP|LOG)expr)|(PI(expr(COMP|LOG)expr)PD))*PD;
