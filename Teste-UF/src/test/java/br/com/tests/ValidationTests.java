package br.com.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import study.Validacao;
import study.exceptions.InvalidCPFException;
import study.exceptions.InvalidEmailException;

/***
 * 
 * @author geovan
 *
 */
public class ValidationTests
{
	
	/***
	 * 
	 */
	private Validacao validacao;

	@Before
	public void antes()
	{
		validacao = new Validacao();
	}
	
	@Test
	public void deveSerValido() throws Exception
	{
		validacao.validarCPFComExcecao("39232102803");
	}
	
	@Test(expected = InvalidCPFException.class)
	public void naoDeveSerValido() throws InvalidCPFException
	{
		validacao.validarCPFComExcecao("39232102802");
	}
	
	@Test
	public void deveSerValidoBooleano()
	{
		boolean validarCPF = validacao.validarCPF("39232102803");
		assertTrue(validarCPF);
	}
	
	@Test
	public void naoDeveSerValidoBooleano()
	{
		boolean validarCPF = validacao.validarCPF("39232102802");
		assertFalse(validarCPF);
	}
	
	@Test
	public void deveValidarEmail()
	{
		boolean validarEmail = validacao.validarEmail("geovansilvagoes@gmail.com");
		assertTrue(validarEmail);
	}
	
	@Test
	public void emailNaoDeveSerValidadoBoolean()
	{
		boolean validarEmail = validacao.validarEmail("geovansilvagoesgmail.com");
		assertFalse(validarEmail);
	}
	
	@Test
	public void deveValidarEmailComExcecao() throws InvalidEmailException
	{
		validacao.validarEmailComExcecao("geovans@gmail.com");
	}
	
	@Test(expected = InvalidEmailException.class)
	public void naoDeveValidarEmailComExcecao() throws InvalidEmailException
	{
		validacao.validarEmailComExcecao("geovansgmail.com");
	}
	
}
