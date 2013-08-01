package br.com.sumba.message.imp;

import java.io.Serializable;
import java.util.List;

import br.com.lombok.enumerator.LocaleEnum;
import br.com.lombok.i18n.I18nUtil;
import br.com.sumba.message.ILogFormater;
import br.com.sumba.message.ILogMessage;


/**
 * Classe que implementa os métodos definidos plea interface {@link ILogFormater}.
 * 
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public class LogFormaterDefault implements ILogFormater, Serializable {


	private static final long serialVersionUID = 1L;


	public String format(List<ILogMessage> listLogMessage, LocaleEnum locale) {
		StringBuilder sb = new StringBuilder();
		for (ILogMessage log : listLogMessage) {
			
			String date = I18nUtil.getInstance().getDateFormatter(locale).format(log.getDate());
			String hour = I18nUtil.getInstance().getTimeFormatter(locale).format(log.getDate());
			
			sb.append("\n");
			sb.append(date + " - " + hour);
			sb.append(" - ");
			sb.append(log.getCategory().getDescrption());
			sb.append(" - ");
			sb.append(log.getId());
			sb.append(" - ");
			if(log.getMessage().getArguments()!=null && log.getMessage().getArguments().length>0){
				sb.append(log.getMessage().getTranslation().transnlate(locale));
			}else{
				sb.append(log.getMessage().getTranslation().transnlate(locale));
			}
			
			
			
		}
		return sb.toString();
	}

}