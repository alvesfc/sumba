package br.com.sumba.message;

import java.util.Date;

import br.com.nias.message.IMessage;
import br.com.sumba.enumerator.LogCategoryEnum;

/**
 * Interface respons�vel em definir os m�todos necess�rios para<BR>
 * manipular a mensagem de erro que ser�o adicionada ao Log.
 * 
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public interface ILogMessage  {

	/**
	 * M�todo respons�vel em retornar o id da mensagem da exce��o.
	 * 
	 * @return inteiro representando o Id da exce��o.
	 */
	public abstract int getId();

	/**
	 * M�todo respons�vel em retornar a menssagem de exce��o.
	 * 
	 * @return {@link IMessage} objrto contendo os dados da mensagem 
	 */
	public abstract IMessage getMessage();

	/**
	 * M�todo respons�vel em a categoria do Log
	 * 
	 * @return objeto {@link LogCategoryEnum} contendo a categoria do Log.
	 */
	public abstract LogCategoryEnum getCategory();
	
	/**
	 * M�todo respons�vel em buscar o id do m�dulo
	 * 
	 * @return Integer contendo o id do m�dulo.
	 */
	public abstract Integer getIdModule();
	
	/**
	 * M�todo respons�vel em retornar a data da mensagem de exce��o.
	 * 
	 * @return String contendo a data da mensagem de exce��o.
	 */
	public abstract Date getDate();



}