package gramaticas;

import java.util.ArrayList;

public class Function {
	
	private String variableRetorno;
	private String nombre;
	private ArrayList<String> argumentos;
	private ArrayList<String> variables;
	
	/**
	 * Constructor principal
	 * @param variableRetorno
	 * @param nombre
	 * @param argumentos
	 */
	public Function(String variableRetorno, String nombre, ArrayList<String> argumentos){
		this.variableRetorno = variableRetorno;
		this.nombre = nombre;
		this.argumentos = argumentos;
		this.variables = new ArrayList<>();
		
		
	}
	/**
	 * Constructor auxiliar donde la funcion no consta ni de parametros ni de retorno
	 * @param nombre
	 */
	public Function(String nombre)
	{
		this("", nombre, null);
	}
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
	 * Metodo para añadir una nueva variable que ha aparecido en la lectura 
	 * @param variable
	 */
	public void addVariable(String variable)
	{
		if (variables.indexOf(variable) == -1)
		{
			variables.add(variable);
		}
	}
	/**
	 * 
	 * @return
	 */
	public int getVariablesSize()
	{
		return variables.size();
	}
	
}
