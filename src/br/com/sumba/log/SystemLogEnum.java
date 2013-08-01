package br.com.sumba.log;

import br.com.lombok.enumerator.LocaleEnum;
import br.com.sumba.message.ILogMessage;
import br.com.sumba.message.LogMessageDefault;

/**
 * Enumerator responsel em armazenar as informações das possíveis<BR>
 * exceções que poderão ocorrer na aplicação. 
 * 
 * @since 23-03-2012
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public enum SystemLogEnum {
	
	DESCONHECIDO(10001,"system_log_desconhencido");
	
	private int id;
	private String message;
	
	private SystemLogEnum(int id,String mensagem){
		this.id = id;
		this.message = mensagem;
	}

	//Opcional {Throwable} - Pode ser erro de Negócio então não terá Stacktrace
	//Opcional {LocaleEnum} - Caso não seja informado o Locale será setado Default

	public ILogMessage getLogMensage(){
		ILogMessage log = new LogMessageDefault(this.id, this.message);
		
		return log;
	}
	
	public ILogMessage getLogMensage(LocaleEnum locale){
		ILogMessage log = new LogMessageDefault(this.id, this.message, locale);
		
		return log;
	}
	
	public ILogMessage getLogMensage(Throwable throwable){
		ILogMessage log = new LogMessageDefault(this.id, this.message, throwable);
		
		return log;
	}
	
	public ILogMessage getLogMensage(LocaleEnum locale, Throwable throwable){
		ILogMessage log = new LogMessageDefault(this.id, this.message, throwable, locale);
		
		return log;
	}
}
