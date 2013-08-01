package br.com.sumba.test;

import br.com.sumba.exception.SumbaException;
import br.com.sumba.log.SystemLogEnum;

public class Teste {

	public static void main(String[] args) {

		SumbaException ex = new SumbaException(
				SystemLogEnum.DESCONHECIDO.getLogMensage());

		
		System.out.println(ex.getLogMessage().getMessage());

	}

}
