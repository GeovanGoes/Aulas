package app;
import java.util.List;

/**
 * 
 */

/**
 * @author geovan.goes
 *
 */
public class Exercises
{

	
	/**
	 * Método responsável por inverter uma palavra
	 * @param palavra
	 * @return
	 */
	public String inverterPalavra(String palavra)
	{
		String resultado  = "";
		if (palavra == null)
		{	
			resultado = "llun";
		}
		else
		{
			for (int iterador = palavra.length()-1 ; iterador >= 0 ; iterador--)
			{
				resultado = resultado + palavra.charAt(iterador);
			}
		}
		
		return resultado;
	}
	
	/***
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int multiplicar(int x, int y)
	{
		int resultado = 0;
		for (int i = 0 ; i < x ; i++)
			resultado =  resultado + y;
		return resultado;
			
	}
	
	/***
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return
	 */
	public int divisaoDeInteiros(int dividendo, int divisor)
	{
		int resultado = 0;
		if (dividendo > 0 && divisor > 0)
		{
			while (dividendo >= divisor)
			{
				dividendo = dividendo - divisor;
				resultado++;
			}
		}
		return resultado;
	}
	
	/***
	 * 
	 * @param lista
	 * @return
	 */
	public Double calcularMediaDeUmaLista(List<Integer> lista)
	{
		double resultado = 0;
		
		if (lista != null && !lista.isEmpty())
		{
			Integer somaTotal = 0;
			
			for (Integer item : lista)
				somaTotal = somaTotal + item;
			
			resultado = somaTotal / lista.size();
		}
		return resultado; 
	}
}
