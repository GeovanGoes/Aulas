package app;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.joda.time.DateTime;

import banco.BancoDeDados;
import modelos.Cidade;
import modelos.Estado;

public class Aplicacao 
{
	public static void main(String[] args) 
	{
		
		Calendar instance = Calendar.getInstance();
		int mes = instance.get(Calendar.MONTH);
		int ano = instance.get(Calendar.YEAR);
		
		String mesBarraAno = "";
		
		if (mes+1 < 10)
		{
			mesBarraAno = "0" + String.valueOf(mes+1) + "/" +ano; 
		}
		else
		{
			mesBarraAno = String.valueOf(mes+1) + "/" +ano;
		}
		
		
		System.out.println(mesBarraAno) ;
		
		///
		
		DateTime hoje = DateTime.now();
		System.out.println(hoje);
		int monthOfYear = hoje.getMonthOfYear();
		
		System.out.println(monthOfYear);
		
		
		
		System.out.println("Iniciando");
		
		System.out.println("Digite o id do estado");
		
		Scanner sc = new Scanner(System.in);
		int idEstado = sc.nextInt();
		
		Estado abc = BancoDeDados.obterEstado(idEstado);
		
		if (abc != null)
		{
			System.out.println("Nome do estado: " + abc.getNome());
			System.out.println("Lista de Cidades...");
			List<Cidade> cidades = abc.getCidades();
			for(Cidade cidade : cidades) {
				
				
				
				System.out.println("Cidade" + cidade.getNome());
			}
			
		}
		else
		{
			System.out.println("Não existe estado com o id " + idEstado);
		}
	}
}
