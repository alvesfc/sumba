package br.com.sumba.enumerator;

import java.io.Serializable;

/**
 * Enumerator responsável em armazenar as categorias de Log do Sistema.<BR>
 * 
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public enum LogCategoryEnum {

	ALTA(0, "msg_alta"),
	MEDIA(1, "msg_media"),
	BAIXA(2, "msg_baixa");

	private int id;
	private String descrption;

	private LogCategoryEnum(int id, String descrption) {
		this.id = id;
		this.descrption = descrption;
	}

	public int getId() {
		return id;
	}

	public String getDescrption() {
		return descrption;
	}

}
