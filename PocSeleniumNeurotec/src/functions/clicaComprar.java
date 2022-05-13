package functions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class clicaComprar {
	
	@Test
	public static void clickCompra() throws Exception{
		
		
		evidenciasPrint.main("btnCompra",before.diretorio,before.dataFormatada);
		before.geradorLog("Procurando botão comprar","INFO");
		before.driver.findElement(By.xpath("//*[@id=\"blocoValores\"]/div[2]/button")).click();
		Thread.sleep(1000);
		before.geradorLog("Botão Comprar clicado com sucesso","INFO");
		
		evidenciasPrint.main("btnCompra2",before.diretorio,before.dataFormatada);
		Thread.sleep(1000);
	}
}

 