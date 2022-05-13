package functions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class selecionaItem {
	
	@Test
	
	public static void test() throws Exception  {
		
		JavascriptExecutor j = (JavascriptExecutor) before.driver;
		j.executeScript("window.scrollBy(0,500)");
		before.geradorLog("Centralizando item na tela","INFO");
		
		evidenciasPrint.main("selecionaItem",before.diretorio,before.dataFormatada);
		
		before.geradorLog("Buscando item.","INFO");
		WebElement console = before.driver.findElement
				(By.xpath("//*[@id=\"listing\"]/article/section/div[3]/div/main/div[1]/a/div"));
		
		before.geradorLog("Elemento encontrado","INFO");
		
		String texto = console.getText();
		before.geradorLog("------Item selecionado-------\n"+texto+"\n------Item selecionado-------", "INFO");
		
		Thread.sleep(1500);
		console.click();
		before.geradorLog("Elemento clicado","INFO");
		Thread.sleep(2000);
	}
}
