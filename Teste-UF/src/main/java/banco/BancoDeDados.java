package banco;

import java.util.ArrayList;
import java.util.List;

import modelos.Cidade;
import modelos.Estado;

public class BancoDeDados 
{
	
	
	public static Estado obterEstado (long id)
	{
		List<Estado> xba;
		
		xba = obterEstados();
		
		
		for(Estado estado : xba)
		{
			if (estado.getId() == id)
			{
				return estado;
			}
		}
		
		return null;
	}
	
	public static List<Estado> obterEstados ()
	{
		
		List<Estado> lista = new ArrayList<Estado>();
	
		
		/**Criação do estado de São Paulo*/
		
		long idSp = 1;
		String nomeSp = "SP";
		
		/**Criação das cidades do estado de são paulo*/
		
		/**Declaração, instanciação(new) e inicialização(=)*/
		List<Cidade> cidadesSaoPaulo = new ArrayList<Cidade>();
		
		long idCidadeSp = 1;
		String nomeCidadeSp = "São Paulo";
		Cidade cidadeSp = new Cidade(idCidadeSp, nomeCidadeSp);
		cidadesSaoPaulo.add(cidadeSp);
		
		cidadesSaoPaulo.add(new Cidade(2, "Taboão"));
		
		Estado sp = new Estado(idSp, nomeSp, cidadesSaoPaulo);
		lista.add(sp);
		/**Criação do estado do Rio de Janeiro*/
		
		
		long idRJ = 2;
		String nome = "RJ";
		
		/**Criação das cidades do estado rio de janeiro*/
		
		List<Cidade> cidadesRioDeJaneiro = new ArrayList<Cidade>();
		long idCidaderio = 1;
		String nomeCidadeRj = "Rio De Janeiro";
		Cidade cidadeRioDejaneiro = new Cidade(idCidaderio, nomeCidadeRj);
		cidadesRioDeJaneiro.add(cidadeRioDejaneiro);
		
		String nomeCidadeNiteroi = "Niteroi";
		long idCidadeNiteroi = 2;
		Cidade niteroi = new Cidade(idCidadeNiteroi, nomeCidadeNiteroi);
		cidadesRioDeJaneiro.add(niteroi);
		
		Estado rioDeJaneiro = new Estado(idRJ , nome, cidadesRioDeJaneiro); 
		lista.add(rioDeJaneiro);
			
		
		
		return lista;
	}
}
