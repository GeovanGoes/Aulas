package revision;
import java.util.ArrayList;
import java.util.List;


public class Revisao
{
	public static void main(String[] args)
	{
		//System.out.println("Hello");
		
				/*devolveLista(1, 2, "");
				
				String nome1 = "a";
				String nome2 = "a";
				//System.out.println(nome1 == nome2);
				
				StringBuffer sbf = new StringBuffer("a");
				StringBuffer sbf2 = new StringBuffer("a");
				//System.out.println(sbf == sbf2);
				
				System.out.println(nome1);
				nome1 = nome1.toUpperCase();
				System.out.println(nome1.compareTo(nome2));
				System.out.println(nome1);
				System.out.println(nome1);*/
				
				
				comparar(10, null);
				
				List<String> devolveLista = devolveLista(1, 2, null);
				
				if (devolveLista != null)
				{
					//minha logica
					System.out.println("Tudo certo");
				}
				else
				{
					System.out.println("errado");
				}
		
	}
	
	/**
	 * djsklajdklasjdla
	 * dasjkldjkasljdlas
	 * nfjksahkfdasjkdas]
	 * dasjkdhjkashdjkhasjdhjkashdjkhasjkdhjkas
	 * djaskhdjkashdjkhasdjk
	 * kdsakdhasjdhkasdsajk
	 * 
	 * @param a
	 * @param b
	 * @param x
	 * @return
	 */
	public static List<String> devolveLista(int a, int b, String x)
	{
		if (x != null)
		{
			List<String> arrayList = new ArrayList<String>();
			arrayList.add(x.toLowerCase());
			return arrayList;
		}
		else
			return null;
	}
	
	/**
	 * 
	 * @param param
	 */
	public static void comparar(int param, String abc)
	{
		//verificar se uma pessoa tem entre 15 e 18 anos 
		// se for menor de 15 mostro que é menor de 15
		// se for maior de 18 mostro que é maior
		// se tiver dentro da faixa mostro um é isso ai
		
		
		String result = 
				(abc != null && param > 0) || (abc != null && abc.contains("1"))
				? ""
				: null; 
		
		if (abc != null && param > 0)
		{
			if (abc != null && abc.contains("1"))
			{
				
			}
			else
			{
				
			}
		}
		else
		{
			
		}
		
		String a = "a";
		String b = "b";
		String c = "c";
		
		List<String> list = new ArrayList<String>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		/*forUm:
		for(int indice = 0 ; indice < 10 ; indice++)
		{
			for(int indice2 = 0 ; indice2 < list.size() ; indice2++)
			{
				System.out.println(list.get(indice2));
				if (indice == 5)
				{
					break forUm;
				}
			}
			System.out.println(indice + "-------------------------------");
			
		}*/
		
			//tipo var : lista a incrementada
		
		/*int indice = 0;
		for(String nome : list)
		{
			System.out.println(nome);
			indice++;
		}*/
		
		/*int indice = 0;
		while (indice < list.size())
		{
			System.out.println(list.get(indice));
			indice++;
		}*/
		
		
		
		
		
		/*try
		{
			Double.parseDouble("a");
			String nula = null;
			nula.contains("a");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*if (result == null)
		{
			System.out.println("Problemas...");
			return;
		}
		
		
		if (
				param < 15 && 
				(param == 2 || param > 1) && 
				String.valueOf(param).contains("1")
			)
		{
			System.out.println("é menor de 15");
		}
		else if (param > 18)
		{
			System.out.println("é maior 18");
		}
		else
		{
			System.out.println("é isso ai");
		}
		
		if (param > 15 && param < 18)
		{
			
		}*/
	}
}
