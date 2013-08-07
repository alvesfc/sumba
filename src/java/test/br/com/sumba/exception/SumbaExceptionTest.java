package br.com.sumba.exception;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import br.com.sumba.message.ILogMessage;
import br.com.sumba.message.LogEnum;

public class SumbaExceptionTest {
    
    @Test
    public void testSumbaExceptionListMessage() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();
        
        SumbaException sb = new SumbaException(log);
        
        int expected = 1;
        int actual = sb.getListLogMessage().size();

        Assert.assertEquals(expected, actual);

    }
    
    @Test
    public void testSumbaExceptionLogMessage() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();
        
        SumbaException sb = new SumbaException(log);
        
        ILogMessage expected = log;
        ILogMessage actual = sb.getLogMessage();

        Assert.assertEquals(expected, actual);

    }
    
    @Test
    public void testSumbaExceptionListLogMessage() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();
        ILogMessage log2 = LogEnum.ERROR.getLogMessage();
        
        List<ILogMessage> logs = new ArrayList<ILogMessage>();
        logs.add(log);
        logs.add(log2);
        
        SumbaException sb = new SumbaException(logs);
        
        int expected = 2;
        int actual = sb.getListLogMessage().size();

        Assert.assertEquals(expected, actual);

    }
}
