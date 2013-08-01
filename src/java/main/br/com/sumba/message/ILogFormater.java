package br.com.sumba.message;

import java.util.List;

import br.com.lombok.enumerator.LocaleEnum;
import br.com.nias.bundle.IMessageBundle;



/**
 * Interface respons�vel em definir os M�todos necess�rios para<BR>
 * formata��o da mensagem de log
 * 
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public interface ILogFormater {


	/**
	 * M�todo respons�vel em formatar a mensagem de Log.
	 * 
	 * @param listLogMessage
	 *            Lista de objetos do tipo {@link ILogMessage} com os dados da mensagem de
	 *            log.
	 * @param bundle objeto do tipo {@link IMessageBundle} para obter o valor da mensagem.
	 * @return String com a mensagem formatada.
	 */
	public String format(List<ILogMessage> listLogMessage, LocaleEnum locale);

}
