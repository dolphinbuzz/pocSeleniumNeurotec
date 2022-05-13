package functions;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class busca_item {

	@Test
	public static void test() throws Exception  {
		
		//Procurando input de busca
		Thread.sleep(300);
		before.geradorLog("Procurando input de busca.", "INFO"); //gera log
		WebElement searchBox = before.driver.findElement(By.xpath("//*[@id=\"input-busca\"]"));
		before.geradorLog("Input de busca encontrado.", "INFO"); //gera log
		
		searchBox.sendKeys("console ps4");    //escrevendo item de busca 
		before.geradorLog("Item inserido no campo de busca.", "INFO"); //gera log
		Thread.sleep(300);
		
		evidenciasPrint.main("pesquisaConsolePS4",before.diretorio,before.dataFormatada);
		searchBox.submit();  
		before.geradorLog("Busca realizada.", "INFO"); //gera log
		Thread.sleep(1000);

		
	}
}
