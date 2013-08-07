package br.com.sumba.message.imp;

import java.text.DateFormat;
import java.util.List;

import br.com.lombok.enumerator.LocaleEnum;
import br.com.lombok.i18n.I18nUtil;
import br.com.nias.message.ITranslation;
import br.com.nias.message.imp.TranslateDefault;
import br.com.sumba.message.ILogFormater;
import br.com.sumba.message.ILogMessage;

/**
 * Classe que implementa os métodos definidos plea interface
 * {@link ILogFormater}.
 * 
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public class LogFormaterDefault implements ILogFormater {

    private static final long serialVersionUID = 1L;
    private static final String SEPARATOR = " - ";

    public String format(List<ILogMessage> listLogMessage, LocaleEnum locale) {
        StringBuilder sb = new StringBuilder();

        for (ILogMessage log : listLogMessage) {

            DateFormat df = I18nUtil.getInstance().getDateFormatter(locale);
            String date = df.format(log.getDate());
            String hour = df.format(log.getDate());

            sb.append("\n");
            sb.append(date + SEPARATOR + hour);
            sb.append(SEPARATOR);
            sb.append(log.getCategory().getDescrption());
            sb.append(SEPARATOR);
            sb.append(log.getId());
            sb.append(SEPARATOR);

            ITranslation translation = new TranslateDefault(log.getMessage());
            sb.append(translation.transnlate(locale));

        }
        return sb.toString();
    }

}