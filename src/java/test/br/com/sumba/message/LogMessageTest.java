package br.com.sumba.message;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import br.com.nias.message.IMessage;
import br.com.sumba.enumerator.LogCategoryEnum;

public class LogMessageTest {

    @Test
    public void testMessageCategory() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();

        LogCategoryEnum expected = LogCategoryEnum.HIGHT;
        LogCategoryEnum actual = log.getCategory();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMessageKey() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();

        String expected = "msg_unknown_error";
        String actual = log.getMessage().getKey();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMessageArguments() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage("Args");
        IMessage msg = log.getMessage();

        int expected = 1;
        int actual = msg.getArguments().length;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMessageMultArguments() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage("Args", "Args2");
        IMessage msg = log.getMessage();

        int expected = 2;
        int actual = msg.getArguments().length;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMessageArgumentsEmpty() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();
        IMessage msg = log.getMessage();

        int expected = 0;
        int actual = msg.getArguments().length;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMessageIdModule() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();

        Integer expected = 0;
        Integer actual = log.getIdModule();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMessageId() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();

        int expected = 1;
        int actual = log.getId();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMessageDate() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();

        Date object = log.getDate();

        Assert.assertNotNull(object);

    }

    @Test
    public void testLogCategoryDescription() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();
        LogCategoryEnum category = log.getCategory();

        String expected = "msg_hight";
        String actual = category.getDescrption();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLogCategoryID() {
        ILogMessage log = LogEnum.UNKNOWN.getLogMessage();
        LogCategoryEnum category = log.getCategory();

        int expected = 0;
        int actual = category.getId();

        Assert.assertEquals(expected, actual);

    }
}
