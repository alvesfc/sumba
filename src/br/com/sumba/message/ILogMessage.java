package br.com.sumba.message;

import br.com.lombok.enumerator.LocaleEnum;

/**
 * Interface responsável em definir os Métodos necessários para<BR>
 * manipular a mensagem de erro que será adicionada ao Log.
 * 
 * @since 19-03-2012
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public interface ILogMessage {

	/**
	 * Método responsável em retornar o id da mensagem da exceção.
	 * 
	 * @return inteiro representando o Id da exceção.
	 */
	public abstract int getId();

	/**
	 * Método responsável em retornar a mensagem da exceção.
	 * 
	 * @return String contendo a mensagem da exceção.
	 */
	public abstract String getMessage();

	/**
	 * Método responsável em retornar o StackTrace da exceção.
	 * 
	 * @return String contendo o StackTrace da exceção.
	 */
	public abstract String getStacktrace();

	/**
	 * Método responsável em adicionar o Locale para definir o, idioma da
	 * mensagem de exceção.
	 * 
	 * @param locale Enumerator contendo idioma da mensagem de exceção. 
	 */
	public abstract void setLocale(LocaleEnum locale);

}
