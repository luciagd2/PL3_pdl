package gramaticas;

import java.util.ArrayList;

public class TSimbolos {
	
	private Function main;
	private ArrayList<Function> funciones;
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
	 * @param programa
	 */
	public void setPrograma(Function main)
	{
		this.main = main;
	}
	
	/**
	 * Añadir la funcion a la estructura donde guardaremos todas las funciones del fichero
	 * @param funcion
	 */
	public void addFunction(Function funcion)
	{
		funciones.add(funcion);
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
		return funciones.get(indice);
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
	 * @param valor
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
	
	
	
	

}
