parser grammar GrammarpruebaParser;

options {
	tokenVocab = GrammarpruebaLexer;
}

@header {
	package gramaticas;

}

//Regla principal
prog: ((expr|asign|func)FIN)* #programa ;

//Regla de asignación
asign: LET VAR (IG (expr|func))? #initVariable
    |       VAR IG (expr|func) #asigVariable
    ;
//Regla expresión -> devuelve uno de los tipos de datos
expr:    PI expr PD				#expEntreParentesis
    |    expr EXP expr			#exponente
    |    expr SUMRES expr	 	#sumRes
    |	 expr MULDIVMOD expr 	#mulDivMod
    |    NUM					#numero
    |    TXT					#texto
    |    POL					#polinomio
    |    VAR					#variable
    |    VAL PI (POL|VAR) (COMA POL COMA (NUM|VAR))* PD	#valor
    |	 llamFunc				#llamadaFuncion
    ;

//Regla con las funciones o llamadas a funciones del lenguaje

func:       FUNCT VAR declVFunc bloq_cod #funcion;
bifur: 	IF PI (condicionCompuesta|condicion) PD bloq_cod;
bucle :  WHILE PI logico PD bloq_cod;
print:  PRINT PI expr PD ;
llamFunc:	 VAR vFunc;

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
sent: (llamFunc|asign|expr|func|bifur|bucle|print) FIN;            //Sentencias de un bloque de codigo
//Regla de la condicion
condicion: (OPNEG)?PI?((expr(COMP|LOG)expr)|(PI(expr(COMP|LOG)expr)PD))PD?;
//Regla para condiciones compuestas
condicionCompuesta: condicion (COMP|LOG) condicion ;
