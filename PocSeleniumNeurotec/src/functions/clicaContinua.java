 package functions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class clicaContinua {
	
	@Test
	public static void clickContinue() throws Exception{
		
		Thread.sleep(500);
		//String printContinua = ;
		evidenciasPrint.main("btnContinua",before.diretorio,before.dataFormatada);
		System.out.println("Procurando botao  'continuar'.");
		before.driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div[3]/button[2]")).click();
		System.out.println("Botão 'continuar' clicado com sucesso.");
		Thread.sleep(500);
		
	}

}
