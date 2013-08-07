package br.com.sumba.exception;

import java.util.ArrayList;
import java.util.List;

import br.com.sumba.message.ILogMessage;

/**
 * Classe que extende da {@link Exception} responsável pelo controle de
 * exceções.
 * 
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public class SumbaException extends Exception {

    private static final long serialVersionUID = 1L;

    private List<ILogMessage> listLogMessage;

    /**
     * Construtor que recebe como argumento um objeto {@link ILogMessage}<BR>
     * para o tratamento da excecão.
     * 
     * @param logMessage
     *            - Objeto contendo os dados da mensagem de excecão.
     */
    public SumbaException(ILogMessage logMessage) {
        this.listLogMessage = new ArrayList<ILogMessage>();
        this.listLogMessage.add(logMessage);
    }

    /**
     * Construtor que recebe com argumento uma lista de objetos
     * {@link ILogMessage}<BR>
     * para o tratamento da excecão.
     * 
     * @param listLogMessage
     *            - Objeto contendo uma lista com os dados da mensagem de
     *            excecão.
     */
    public SumbaException(List<ILogMessage> listLogMessage) {
        this.listLogMessage = listLogMessage;
    }

    /**
     * Método responsável em retornar um objeto {@link ILogMessage}<BR>
     * com os detalhes da excecão.
     * 
     * @return {@link ILogMessage} com os detalhes da excecão.
     */
    public ILogMessage getLogMessage() {
        return this.listLogMessage.get(0);
    }

    /**
     * Método responsável em retornar uma lista de objetos {@link ILogMessage}<BR>
     * com os detalhes da excecão.
     * 
     * @return lista de {@link ILogMessage} com os detalhes da excecão.
     */
    public List<ILogMessage> getListLogMessage() {
        return this.listLogMessage;
    }

}
