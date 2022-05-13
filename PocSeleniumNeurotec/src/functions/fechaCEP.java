package functions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class fechaCEP {
	
	@Test
	public static void test() throws Exception {
		//fechando pop cep
		before.geradorLog("Prurando btn para fechar tela com datas.", "INFO"); //gera log
		WebElement btnClose = before.driver.findElement
				(By.xpath("//*[@id=\"modalWrapper\"]/div/div[1]/div[2]"));
		
		before.geradorLog("Btn para fechar POP up encontrado","INFO");//gera log
		btnClose.click();
		
		before.geradorLog("Btn para fechar POP up clicado","INFO");//gera log
		
		Thread.sleep(300);
		evidenciasPrint.main("btnFechaPOP up",before.diretorio,before.dataFormatada);
		Thread.sleep(300);
		before.geradorLog("POP up fechado","INFO");//gera log
	}
}
