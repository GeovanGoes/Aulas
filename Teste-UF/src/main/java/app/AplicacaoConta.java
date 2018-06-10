package app;

import exceptions.SaldoInsuficienteException;
import exceptions.ValorInvalidoException;
import modelos.Conta;

public class AplicacaoConta
{
	public static void main(String[] args)
	{
		long id = 1;
		double saldo = 500;
		String cpfDoDono = "12345678911";
		String numeroDaConta = "321";
		String numeroAgencia = "001";
		String nomeDoBanco = "Banco do CCSP";
		Conta conta = new Conta(id, saldo, cpfDoDono, numeroDaConta, numeroAgencia, nomeDoBanco);

		try
		{
			System.out.println("Saldo atual: R$" + conta.getSaldo());
			//log.info("inciando chamada ao saque... para a conta "  + conta.getCpfDoDono());
			conta.sacar(100);
			//log.info("chamada ao saque finalizado...");
			System.out.println("O saque foi realizado");
			System.out.println("Você tem R$" + conta.getSaldo());
			
			conta.depositar(-10);
			 
			System.out.println("O saldo apos depósito é: R$" + conta.getSaldo());
		}
		catch (SaldoInsuficienteException | ValorInvalidoException e)
		{
			System.out.println(e.getMessage());
			//log.error("shajkdhjaksda");
			//log.error(e);
		}

	}
}
