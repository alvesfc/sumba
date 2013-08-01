package br.com.sumba.test;

import java.util.ArrayList;
import java.util.Collection;

import br.com.lombok.enumerator.LocaleEnum;
import br.com.nias.bundle.IBundleMap;
import br.com.nias.bundle.IMessageBundle;
import br.com.nias.bundle.imp.BundleMapI18N;
import br.com.nias.bundle.imp.MessageBundleI18N;
import br.com.nias.message.IMessage;
import br.com.nias.message.imp.MessageDefault;
import br.com.sumba.enumerator.LogCategoryEnum;
import br.com.sumba.exception.SumbaException;
import br.com.sumba.message.ILogFormater;
import br.com.sumba.message.ILogMessage;
import br.com.sumba.message.imp.LogFormaterDefault;
import br.com.sumba.message.imp.LogMessageDefault;


public class Test {
	
	private static final String BUNDLE_PATH = "business/LogMessages";
	

	@org.junit.Test
	public void test(){
		
		
		LocaleEnum locale = LocaleEnum.DEFAULT;
		Collection<String> fileNames = new ArrayList<String>();
		fileNames.add(BUNDLE_PATH);
		
		IBundleMap bundleMap = new BundleMapI18N(fileNames);
		
		
		IMessageBundle bundle = new MessageBundleI18N(bundleMap.getResourseBundle(BUNDLE_PATH, locale));
		
		IMessage message = new MessageDefault("msg_validar_campo_tamanho_maximo", "msg_seis","msg_doze");
		ILogMessage log = new LogMessageDefault(10,1,message, LogCategoryEnum.BAIXA);
		SumbaException sbe = new SumbaException(log);
		ILogFormater formater = new LogFormaterDefault();
		
		System.out.println(formater.format(sbe.getListLogMessage(), locale));
	
	}
	
	
	
	
}
