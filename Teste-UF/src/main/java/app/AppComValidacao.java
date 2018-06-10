package app;

import java.util.Scanner;

import study.Validacao;
import study.exceptions.InvalidCPFException;
import study.exceptions.InvalidEmailException;

public class AppComValidacao
{
	public static void main(String[] args)
	{
		
		try
		{
			System.out.println("Digite seu cpf:");
			Scanner sc = new Scanner(System.in);
			sc.close();
			String cpf = sc.next();
			
			System.out.println("Digite seu e-mail:");
			String email = sc.next();
			
			Validacao validador = new Validacao();
			
			
			//validacaoComRetornos(cpf, email, validador);
			
			validarComExcecao(cpf, email, validador);
			
		}
		catch(IllegalStateException ise)
		{
			System.out.println("O scanner está fechado...");
		}
		catch (Exception e)
		{
			System.out.println("Problemas....");
		}
		
		System.out.println("Finalizado....");
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
			System.out.println(e.getMessage());
			houveExcecao = true;
		}
		
		try
		{
			validador.validarEmailComExcecao(email);
		}
		catch(InvalidEmailException em)
		{
			System.out.println(em.getMessage());
			houveExcecao = true;
		}
		
		if (!houveExcecao)
			System.out.println("Todos os dados são válidos");
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
			System.out.println("O cpf é inválido");
		
		boolean emailEhValido = validador.validarEmail(email);
		
		if (!emailEhValido)
			System.out.println("O E-mail é inválido");
		
		if (cpfEhValido && emailEhValido)
		{
			System.out.println("Todos os dados são válidos");
		}
	}
}
