package br.com.sumba.enumerator;

/**
 * Enumerator responsável em armazenar as categorias de Log do Sistema.<BR>
 * 
 * @author Marcos Alves Cunha
 * @version 1.0
 * 
 */
public enum LogCategoryEnum {

    HIGHT(0, "msg_hight"), MEDIA(1, "msg_media"), LOW(2, "msg_low");

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
