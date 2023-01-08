package gramaticas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TSimbolos {
	
	private Function main;
	private ArrayList<HashMap<String,Function>> funciones;
	private Function funcionTemp;
	
	
	
	/**
	 * Cosntructor estandar
	 */
	public TSimbolos()
	{
		this.main = null;
		this.funciones = new ArrayList<>();
		this.funcionTemp = null;
		
		
	}
	/**
	 * Funcion para inicializar el programa
	 */
	public void setPrograma(Function main)
	{
		this.main = main;
	}
	
	/**
	 * A�adir la funcion a la estructura donde guardaremos todas las funciones del fichero
	 * @param funcion
	 */
	public void addFunction(Function funcion)
	{
		String nombre = funcion.getNombre();
		funciones.add(new HashMap<>());
		funciones.get(funciones.size()-1).put(nombre,funcion);
	}
	/**
	 * Funcion para definir el main del fichero en cuestion
	 * @param main
	 */
	public void setMain(Function main)
	{
		this.main = main;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getFuncionesSize()
	{
		return funciones.size();
	}
	/**
	 * 
	 * @param indice
	 * @return
	 */
	public Function getFuncion(int indice)
	{
		return funciones.get(indice).get(1);
	}
	/**
	 * 
	 * @param funcion
	 */
	public void setFuncionActual(Function funcion)
	{
		funcionTemp = funcion;
	}
	public Function getFuncionActual() {
		return funcionTemp;
	}
	/**
	 * 
	 * @param variable
	 */
	public void addVariable(String variable,String valor)
	{
		if (funcionTemp != null)
		{
			funcionTemp.addVariable(variable,valor);
		}
		else
		{
			main.addVariable(variable,valor);
		}
	}
	
	/**
	 * Inicializo variable sin valor asignado
	 * @param variable
	 */
	public void addVariable(String variable)
	{
		if (funcionTemp != null)
		{
			funcionTemp.addVariable(variable,"");
		}
		else
		{
			main.addVariable(variable,"");
		}
	}
	public void ejecutar(Function funcion){
		for (int i = 0; i<funcion.getBloqueCodigo().size();i++){
			Tripleta linea = funcion.getBloqueCodigo().get(i);
			if(linea.getAccion().equals("print")){
				String valor = linea.getParametro1();
				if(valor.matches("^[a-z]*$")){
					valor = funcion.getVariables(valor);
				}
				if (valor.contains("\"")){
					valor = valor.replaceAll("\"","");
				} else if (valor.contains("\'")){
					valor = valor.replaceAll("\'","");
				}
				System.out.println(valor);
			}
			
			else if(linea.getAccion().equals("asignar")) { // a = 3; a = 3 +5; a = 3-5
				String nombreVar = linea.getParametro1(); //nombre de la variable
				String valor = linea.getParametro2(); //el otro lado del igual
				
				if (!valor.equals("operacion")) {	//asignacion directa
					funcionTemp.addVariable(nombreVar, valor);	//modificar su valor
				}
				else if (valor.equals("operacion")){	// a = b + 3; se le asigna el resultado de una operacion
					continue; // +, 3, 5
				}
					
			}
			
			else if (linea.getAccion().equals("+")) {     // +, 3, 5; +, 3.0, 5   -
				String operando1 = linea.getParametro1();
				String operando2 = linea.getParametro2();
				
				if (!((operando1.contains(".")) && (operando2.contains(".")))) {	//si los 2 son enteros -> rdo es entero
					int rdo = Integer.parseInt(operando1) + Integer.parseInt(operando2);
				}
				else { //alguno no es entero -> rdo float
					float rdo = Float.parseFloat(operando1) + Float.parseFloat(operando2);
				}
			}
			
			else if (linea.getAccion().equals("-")) {    
				String operando1 = linea.getParametro1();
				String operando2 = linea.getParametro2();
				
				if (!((operando1.contains(".")) && (operando2.contains(".")))) {	//si los 2 son enteros -> rdo es entero
					int rdo = Integer.parseInt(operando1) - Integer.parseInt(operando2);
				}
				else { //alguno no es entero -> rdo float
					float rdo = Float.parseFloat(operando1) - Float.parseFloat(operando2);
				}
			}else if (linea.getAccion().equals("*")) {     
				String operando1 = linea.getParametro1();
				String operando2 = linea.getParametro2();
				
				if (!((operando1.contains(".")) && (operando2.contains(".")))) {	//si los 2 son enteros -> rdo es entero
					int rdo = Integer.parseInt(operando1) * Integer.parseInt(operando2);
				}
				else { //alguno no es entero -> rdo float
					float rdo = Float.parseFloat(operando1) * Float.parseFloat(operando2);
				}
			}else if (linea.getAccion().equals("/")) {     
				String operando1 = linea.getParametro1();
				String operando2 = linea.getParametro2();
				
				float rdo = Float.parseFloat(operando1) / Float.parseFloat(operando2);
				
				if ((Float.parseFloat(operando1) % Float.parseFloat(operando2)==0)){
					rdo = Math.round(rdo);
				}
				
			}
			else if (linea.getAccion().equals("%")) {
				String operando1 = linea.getParametro1();
				String operando2 = linea.getParametro2();
				
				if (!((operando1.contains(".")) && (operando2.contains(".")))) {	//si los 2 son enteros -> rdo es entero
					int rdo = Integer.parseInt(operando1) % Integer.parseInt(operando2);
				}
				else { //alguno no es entero -> rdo float
					float rdo = Float.parseFloat(operando1) % Float.parseFloat(operando2);
				}
				
			}else if (linea.getAccion().equals("^")) {
				String operando1 = linea.getParametro1();
				String operando2 = linea.getParametro2();
				
				if (!((operando1.contains(".")) && (operando2.contains(".")))) {	//si los 2 son enteros
					double rdo = Math.pow(Integer.parseInt(operando1), Integer.parseInt(operando2));
				}
				else { //alguno no es entero -> rdo float
					double rdo = Math.pow(Float.parseFloat(operando1), Float.parseFloat(operando2));
				}
			}
		}
	}
	
	
	
	

}
