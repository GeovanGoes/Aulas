package app;

import java.util.Scanner;

import org.apache.log4j.Logger;

import study.Validacao;
import study.exceptions.InvalidCPFException;
import study.exceptions.InvalidEmailException;

public class AppComValidacao
{
	
	/**
	 * Instancia de log
	 * */
	final static Logger _log = Logger.getLogger(AppComValidacao.class);
	
	public static void main(String[] args)
	{
		_log.info("Testing my log system...");
		try
		{
			System.out.println("Digite seu cpf:");
			Scanner sc = new Scanner(System.in);
			String cpf = sc.next();
			
			System.out.println("Digite seu e-mail:");
			String email = sc.next();
			
			Validacao validador = new Validacao();
			
			
			//validacaoComRetornos(cpf, email, validador);
			
			validarComExcecao(cpf, email, validador);
			
			sc.close();
			
		}
		catch(IllegalStateException ise)
		{
			_log.error("O scanner está fechado...");
		}
		catch (Exception e)
		{
			_log.error("Problemas....");
		}
		
		_log.info("Finalizado....");
	}
	
	private static void validarComExcecao(String cpf, String email, Validacao validador)
	{
		boolean houveExcecao = false;
		
		try
		{
			validador.validarCPFComExcecao(cpf);
		}
		catch(InvalidCPFException e)
		{
			_log.error(e.getMessage());
			houveExcecao = true;
		}
		
		try
		{
			validador.validarEmailComExcecao(email);
		}
		catch(InvalidEmailException em)
		{
			_log.error(em.getMessage());
			houveExcecao = true;
		}
		
		if (!houveExcecao)
			_log.info("Todos os dados são válidos");
	}

	/***
	 * 
	 * @param cpf
	 * @param email
	 * @param validador
	 */
	private static void validacaoComRetornos(String cpf, String email, Validacao validador)
	{
		boolean cpfEhValido = validador.validarCPF(cpf);
		
		if (!cpfEhValido)
			_log.error("O cpf é inválido");
		
		boolean emailEhValido = validador.validarEmail(email);
		
		if (!emailEhValido)
			_log.error("O E-mail é inválido");
		
		if (cpfEhValido && emailEhValido)
		{
			_log.info("Todos os dados são válidos");
		}
	}
}
