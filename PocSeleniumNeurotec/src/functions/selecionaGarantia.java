package functions;

import org.junit.jupiter.api.Test;

public class selecionaGarantia {
	
	
	@Test
	public static void selectGarantia() throws Exception{
	
		Thread.sleep(1000);
		evidenciasPrint.main("garantia",before.diretorio,before.dataFormatada);
		
		before.geradorLog("passou pela garantia","INFO");
	}
}
