package br.com.sumba.message.imp;

import java.io.Serializable;
import java.util.Date;

import br.com.nias.message.IMessage;
import br.com.sumba.enumerator.LogCategoryEnum;
import br.com.sumba.message.ILogMessage;

/**
 * Classe que implementa os métodos definidos pela interface {@link ILogMessage}
 * .
 * 
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public class LogMessageDefault implements ILogMessage, Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private int idModule;
	private IMessage message;
	private LogCategoryEnum categoria;
	private Date date;

	public LogMessageDefault(int id, int idModule, IMessage message, LogCategoryEnum categoria) {
		this.id = id;
		this.id = idModule;
		this.message = message;
		this.categoria = categoria;
		this.date = new Date();

	}


	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public IMessage getMessage() {
		return this.message;
	}

	@Override
	public LogCategoryEnum getCategory() {
		return this.categoria;
	}

	@Override
	public Date getDate() {
		return this.date;
	}

	@Override
	public Integer getIdModule() {
		return this.idModule;
	}



}
