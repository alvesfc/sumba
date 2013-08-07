package br.com.sumba.message;

import br.com.nias.message.IMessage;
import br.com.nias.message.imp.MessageDefault;
import br.com.sumba.enumerator.LogCategoryEnum;
import br.com.sumba.message.imp.LogMessageDefault;

public enum LogEnum implements ILogMessageFactory {

    UNKNOWN(1, 0, "msg_unknown_error", LogCategoryEnum.HIGHT),
    ERROR(2, 0, "msg_error", LogCategoryEnum.LOW),

    ;

    private int id;
    private int idModule;
    private String key;
    private LogCategoryEnum categoria;

    private LogEnum(int id, int idModule, String key, LogCategoryEnum categoria) {
        this.id = id;
        this.idModule = idModule;
        this.key = key;
        this.categoria = categoria;
    }

    @Override
    public ILogMessage getLogMessage(Object... args) {
        IMessage message = new MessageDefault(this.key, args);
        ILogMessage log = new LogMessageDefault(this.id, this.idModule,message, this.categoria);
        return log;
    }

}