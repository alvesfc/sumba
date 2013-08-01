package br.com.sumba.message;

import java.util.Date;

import br.com.nias.message.IMessage;
import br.com.sumba.enumerator.LogCategoryEnum;

/**
 * Interface responsável em definir os métodos necessários para<BR>
 * manipular a mensagem de erro que serão adicionada ao Log.
 * 
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public interface ILogMessage  {

	/**
	 * Método responsável em retornar o id da mensagem da exceção.
	 * 
	 * @return inteiro representando o Id da exceção.
	 */
	public abstract int getId();

	/**
	 * Método responsável em retornar a menssagem de exceção.
	 * 
	 * @return {@link IMessage} objrto contendo os dados da mensagem 
	 */
	public abstract IMessage getMessage();

	/**
	 * Método responsável em a categoria do Log
	 * 
	 * @return objeto {@link LogCategoryEnum} contendo a categoria do Log.
	 */
	public abstract LogCategoryEnum getCategory();
	
	/**
	 * Método responsável em buscar o id do módulo
	 * 
	 * @return Integer contendo o id do módulo.
	 */
	public abstract Integer getIdModule();
	
	/**
	 * MÈtodo responsável em retornar a data da mensagem de exceção.
	 * 
	 * @return String contendo a data da mensagem de exceção.
	 */
	public abstract Date getDate();



}