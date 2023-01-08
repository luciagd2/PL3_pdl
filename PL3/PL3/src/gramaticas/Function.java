package gramaticas;

import java.util.ArrayList;
import java.util.HashMap;

public class Function {
	
	private String variableRetorno;
	private String nombre;
	private ArrayList<String> argumentos;
	private HashMap<String,String> variables;
	private ArrayList<String> bloqueCodigo;
	
	/**
	 * Constructor principal
	 * @param variableRetorno
	 * @param nombre
	 * @param argumentos
	 */
	public Function(String nombre,ArrayList<String> bloqueCodigo){
		this.nombre = nombre;
		this.variables = new HashMap<String, String>();
		this.bloqueCodigo = bloqueCodigo;
		
		
	}
	/**
	 * Constructor auxiliar donde la funcion no consta ni de parametros ni de retorno
	 * @param nombre
	public Function(String nombre)
	{
		this("", nombre, null);
	}*/
	
	/**
	 * 
	 * @return
	 */
	public String getVariableRetorno()
	{
		return variableRetorno;
	}
	/**
	 * 
	 * @return
	 */
	public String getNombre()
	{
		return nombre;
	}
	/**
	 * 
	 * @return
	 */
	public int getArgumentosSize()
	{
		return argumentos.size();
	}
	/**
	 * 
	 * @param indice
	 * @return
	 */
	public String getArgumento(int indice)
	{
		return argumentos.get(indice);
	}
	/**
	 * Metodo para a�adir una nueva variable que ha aparecido en la lectura 
	 * @param variable
	 */
	public void addVariable(String variable, String valor)
	{
		variables.put(variable, valor);
	}
	/**
	 * 
	 * @return
	 */
	public int getVariablesSize()
	{
		return variables.size();
	}
	/**
	 * 
	 * @param linea
	 */
	public void addLineaCod(String linea) {
		
		bloqueCodigo.add(linea);
	}
	public void ejecutar(){
		for (String lineacCodigo: bloqueCodigo){

		}
	}
}
