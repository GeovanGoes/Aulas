/**
 * 
 */
package br.com.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import app.Exercises;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author geovan.goes
 *
 */
public class ExercisesTests
{
	
	private Exercises exercises;

	@Before
	public void antes()
	{
		exercises = new Exercises();
	}
	
	@Test
	public void deveInverterPalavra()
	{
		String inverterPalavra = exercises.inverterPalavra("CASA");
		assertNotNull(inverterPalavra);
		assertEquals("ASAC", inverterPalavra);
	}
	
	@Test
	public void deveInverterUmParametroNull()
	{
		String inverterPalavra = exercises.inverterPalavra(null);
		assertNotNull(inverterPalavra);
		assertEquals("llun", inverterPalavra);
	}
	
	@Test
	public void deveInverterMesmoPassandoStringVazia()
	{
		String inverterPalavra = exercises.inverterPalavra("");
		assertNotNull(inverterPalavra);
		assertEquals("", inverterPalavra);
	}
	
	@Test
	public void deveInverterMesmoPassandoStringComEspaco()
	{
		String inverterPalavra = exercises.inverterPalavra(" ");
		assertNotNull(inverterPalavra);
		assertEquals(" ", inverterPalavra);
	}
	
	@Test
	public void deveMultiplicar()
	{
		int multiplicar = exercises.multiplicar(3, 5);
		assertEquals(15, multiplicar);
	}
	
	@Test
	public void deveMultiplicarPorZero()
	{
		int multiplicar = exercises.multiplicar(3, 0);
		assertEquals(0, multiplicar);
	}
	
	@Test
	public void deveSerMultiplicadoPorZero()
	{
		int multiplicar = exercises.multiplicar(0, 5);
		assertEquals(0, multiplicar);
	}
	
	@Test
	public void deveDividir()
	{
		int divisaoDeInteiros = exercises.divisaoDeInteiros(10, 2);
		assertEquals(5, divisaoDeInteiros);
	}
	
	@Test
	public void naoDeveDividirPorZero()
	{
		int divisaoDeInteiros = exercises.divisaoDeInteiros(10, 0);
		assertEquals(0, divisaoDeInteiros);
		
		divisaoDeInteiros = exercises.divisaoDeInteiros(0, 10);
		assertEquals(0, divisaoDeInteiros);
		
		divisaoDeInteiros = exercises.divisaoDeInteiros(0, 0);
		assertEquals(0, divisaoDeInteiros);
	}
	
	@Test
	public void deveDividirArrendondandoPraBaixo()
	{
		int divisaoDeInteiros = exercises.divisaoDeInteiros(11, 2);
		assertEquals(5, divisaoDeInteiros);
	}
	
	@Test
	public void deveDividirApenasSeDividendoForMaiorQueDivisor()
	{
		int divisaoDeInteiros = exercises.divisaoDeInteiros(2, 11);
		assertEquals(0, divisaoDeInteiros);
	}
	
	@Test
	public void deveCalcularMediaDeUmaListaDeNumeros()
	{
		List<Integer> lista = Arrays.asList(new Integer[]{10, 5, 12});
		Double calcularMediaDeUmaLista = exercises.calcularMediaDeUmaLista(lista);
		assertEquals(new Double(9.0), calcularMediaDeUmaLista);
	}
	
	@Test
	public void naoDeveEstourarExcecaoComParametroNuloMedia()
	{
		Double calcularMediaDeUmaLista = exercises.calcularMediaDeUmaLista(null);
		assertEquals(new Double(0.0), calcularMediaDeUmaLista);
	}
	
	@Test
	public void deveCalcularMediaMesmoPassandoListaVazia()
	{
		List<Integer> lista = Arrays.asList(new Integer[]{});
		Double calcularMediaDeUmaLista = exercises.calcularMediaDeUmaLista(lista);
		assertEquals(new Double(0.0), calcularMediaDeUmaLista);
	}
	
	@Test
	public void deveCalcularMediaMesmoPassandoListaComZeros()
	{
		List<Integer> lista = Arrays.asList(new Integer[]{0, 0, 0});
		Double calcularMediaDeUmaLista = exercises.calcularMediaDeUmaLista(lista);
		assertEquals(new Double(0.0), calcularMediaDeUmaLista);
	}
	
	@Test
	public void deveCalcularMediaMesmoContendoApenasUmItemNaLista()
	{
		List<Integer> lista = Arrays.asList(new Integer[]{10});
		Double calcularMediaDeUmaLista = exercises.calcularMediaDeUmaLista(lista);
		assertEquals(new Double(10.0), calcularMediaDeUmaLista);
	}
}
