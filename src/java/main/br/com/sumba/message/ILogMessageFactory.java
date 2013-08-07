package br.com.sumba.message;

/**
 * Interface responsável em definir os métodos para obter uma mensagem de log.
 * 
 * @author Marcos Alves
 * @version 1.0
 * 
 */
public interface ILogMessageFactory {

    /**
     * Método responsável em obter um objeto {@link ILogMessage} com os dados da
     * mensagem de log
     * 
     * @param args
     *            - Array com os argumentos para mensagem.
     * @return objeto {@link ILogMessage} com os dados da mensagem de log.
     */
    ILogMessage getLogMessage(Object... args);

}
