/**
 * 
 */
package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author geovan.goes
 *
 */

@ManagedBean
@ViewScoped
public class SomaValoresBean implements Serializable
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1144184491509014935L;
	
	private String _valorUm = "";
	private String valorDois  = "";
	private String valorTres = "";
	private String valorQuatro = "";
	
	private String total = "Total: 0";
	
	/***
	 * 
	 */
	public void soma()
	{ 
	
	//opa add um coment aqui
		total = "Total: " + String.valueOf(
											obterDoubleDaString(_valorUm) + 
											obterDoubleDaString(valorDois) + 
											obterDoubleDaString(valorTres) + 
											obterDoubleDaString(valorQuatro)
											);
											
											// e outr oaqui
	}
	
	private Double obterDoubleDaString(String param)
	{
		param = param.replace(",", ".");
		return new Double((param.isEmpty() ? "0" : param));
	}
		
	/**
	 * @return the total
	 */
	public String getTotal()
	{
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(String total)
	{
		this.total = total;
	}

	/**
	 * @return the _valorUm
	 */
	public String getValorUm()
	{
		return _valorUm;
	}

	/**
	 * @param _valorUm the _valorUm to set
	 */
	public void setValorUm(String _valorUm)
	{
		this._valorUm = _valorUm;
	}

	/**
	 * @return the valorDois
	 */
	public String getValorDois()
	{
		return valorDois;
	}

	/**
	 * @param valorDois the valorDois to set
	 */
	public void setValorDois(String valorDois)
	{
		this.valorDois = valorDois;
	}

	/**
	 * @return the valorTres
	 */
	public String getValorTres()
	{
		return valorTres;
	}

	/**
	 * @param valorTres the valorTres to set
	 */
	public void setValorTres(String valorTres)
	{
		this.valorTres = valorTres;
	}

	/**
	 * @return the valorQuatro
	 */
	public String getValorQuatro()
	{
		return valorQuatro;
	}

	/**
	 * @param valorQuatro the valorQuatro to set
	 */
	public void setValorQuatro(String valorQuatro)
	{
		this.valorQuatro = valorQuatro;
	}
}
