package study;

import study.exceptions.InvalidCPFException;
import study.exceptions.InvalidEmailException;
import br.com.caelum.stella.validation.CPFValidator;

public class Validacao
{

	/***
	 * 
	 * @param cpf
	 * @throws InvalidCPFException 
	 * @throws Exception
	 */
	public void validarCPFComExcecao(String cpf) throws InvalidCPFException 
	{		
		if(!validarCPF(cpf))
			throw new InvalidCPFException("CPF inválido!");
	}

	/***
	 * 
	 * @param CPF
	 * @return
	 */
	public boolean validarCPF(String cpf)
	{
		try
		{
			new CPFValidator().assertValid(cpf);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	/***
	 * 
	 * @param email
	 * @return
	 */
	public boolean validarEmail(String email)
	{
		if (email == null || email.isEmpty() || !email.contains("@"))
			return false;
		return true;
	}
	
	/***
	 * 
	 * @param email
	 * @throws InvalidEmailException
	 */
	public void validarEmailComExcecao(String email) throws InvalidEmailException
	{
		if (!validarEmail(email))
			throw new InvalidEmailException("Email inválido");
	}
}
