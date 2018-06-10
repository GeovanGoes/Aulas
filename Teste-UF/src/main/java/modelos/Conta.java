package modelos;

import exceptions.SaldoInsuficienteException;
import exceptions.ValorInvalidoException;

public class Conta
{
	
	private long id;
	private double saldo;
	private String cpfDoDono;
	private String numeroDaConta;
	private String numeroAgencia;
	private String nomeDoBanco;
	
	
	
	public Conta(
			long id,
			double saldo,
			String cpfDoDono,
			String numeroDaConta,
			String numeroAgencia,
			String nomeDoBanco
			)
	{
		//comentar sobre o super
		super();
		this.id = id;
		this.saldo = saldo;
		this.cpfDoDono = cpfDoDono;
		this.numeroDaConta = numeroDaConta;
		this.numeroAgencia = numeroAgencia;
		this.nomeDoBanco = nomeDoBanco;
	}

	/*
	private //somente a classe enxerga
	public //todos enxergam
	protected
	default
	*/ 
	
	
	
	/***
	 * 
	 * @param valor
	 * @return
	 * @throws SaldoInsuficienteException
	 * @throws ValorInvalidoException 
	 */
	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException
	{
		boolean saldoEhZerado = this.saldo <= 0;
		boolean pedidoDeSaqueEhMaiorQueSaldo = valor > this.saldo; 
		boolean pedidoDeSaqueEhMaiorOuIgualZero = valor >= 0;
		
		if (saldoEhZerado || pedidoDeSaqueEhMaiorQueSaldo)
			throw new SaldoInsuficienteException("O saldo é insuficiente");
		
		if (pedidoDeSaqueEhMaiorOuIgualZero) 
			this.saldo = this.saldo - valor;
		else
			throw new ValorInvalidoException("O valor é incorreto.");
	}
	
	/**
	 * 
	 * @param valor
	 * @throws ValorInvalidoException 
	 */
	public void depositar(double valor) throws ValorInvalidoException
	{
		boolean valorEhMaiorQueZero = valor > 0;
		
		if (valorEhMaiorQueZero)
			this.saldo = this.saldo + valor;
		else
			throw new ValorInvalidoException("O valor é incorreto");
		
	}
	
	/***
	 * Método responsável 
	 * @return
	 */
	public double getSaldo()
	{
		return this.saldo;
	}

	public String getCpfDoDono()
	{
		return cpfDoDono;
	}

	public void setCpfDoDono(String cpfDoDono)
	{
		this.cpfDoDono = cpfDoDono;
	}

	public long getId()
	{
		return id;
	}

	public String getNumeroDaConta()
	{
		return numeroDaConta;
	}

	public String getNumeroAgencia()
	{
		return numeroAgencia;
	}

	public String getNomeDoBanco()
	{
		return nomeDoBanco;
	}	
}
