package app;

import java.util.List;
import java.util.Scanner;

import banco.BancoDeDados;
import modelos.Cidade;
import modelos.Estado;

public class Aplicacao 
{
	public static void main(String[] args) 
	{
		
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
