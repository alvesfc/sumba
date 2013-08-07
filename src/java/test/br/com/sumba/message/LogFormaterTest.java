package br.com.sumba.message;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.lombok.enumerator.LocaleEnum;
import br.com.sumba.message.imp.LogFormaterDefault;

public class LogFormaterTest {

    
    @Test
    public void testSumbaExceptionListLogMessage() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();
        ILogMessage log2 = LogEnum.ERROR.getLogMessage();
        ILogFormater formater = new LogFormaterDefault();
        
        List<ILogMessage> logs = new ArrayList<ILogMessage>();
        logs.add(log);
        logs.add(log2);
        
        String actual =  formater.format(logs, LocaleEnum.DEFAULT);

        Assert.assertTrue(!actual.isEmpty());

    }
}
