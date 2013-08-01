package br.com.sumba.message;

/**
 * Interface respons�vel em definir os m�todos para obter uma mensagem de log.
 * @author Marcos Alves
 * @version 1.0
 *
 */
public interface ILogMessageFactory {
	
	
	/**
	 * M�todo respons�vel em obter um objeto {@link ILogMessage} com os dados da mensagem de log
	 * @param args - Array com os argumentos para mensagem.
	 * @return objeto {@link ILogMessage} com os dados da mensagem de log.
	 */
	public ILogMessage getLogMessage(Object ...args);
	
	
}
