package functions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class incluiCep {
	
	@Test
	public static void addCep() throws Exception{
		before.geradorLog("Procurando input do cep.", "INFO"); //gera log
		
		//String printCep = ;
		evidenciasPrint.main("cep1",before.diretorio,before.dataFormatada);
		
		//scroll para centralizar o item
		JavascriptExecutor j = (JavascriptExecutor) before.driver;
		j.executeScript("window.scrollBy(0,200)");
		
		
		before.geradorLog("Centralizando item na tela.", "INFO"); //gera log
		
		Thread.sleep(300);
		evidenciasPrint.main("cep2",before.diretorio,before.dataFormatada);
		
		before.geradorLog("Buscando elemento Input CEP na tela.", "INFO"); //gera log
		WebElement cep = before.driver.findElement(By.xpath("//*[@id=\"inputCalcularFrete\"]"));
		before.geradorLog("Elemento Input CEP encontrado com sucesso.", "INFO"); //gera log
		
		cep.sendKeys(Keys.BACK_SPACE);
		cep.sendKeys(Keys.BACK_SPACE);
		cep.sendKeys(Keys.BACK_SPACE);
		cep.sendKeys(Keys.BACK_SPACE);
		cep.sendKeys(Keys.BACK_SPACE);
		cep.sendKeys(Keys.BACK_SPACE);
		cep.sendKeys(Keys.BACK_SPACE);
		cep.sendKeys(Keys.BACK_SPACE);
		before.geradorLog("Apagando espaços em branco no campo do Input CEP.", "INFO"); //gera log
		cep.sendKeys("51240200");
		
		before.geradorLog("CEP inserido.", "INFO"); //gera log
		
		//String printCep2 = "cep3";
		evidenciasPrint.main("cep3",before.diretorio,before.dataFormatada);
		
		cep.submit();
		before.geradorLog("Submit realizado no CEP com sucesso.", "INFO"); //gera log
		
		before.geradorLog("Aguardando lista de datas de frete.", "INFO"); //gera log
		Thread.sleep(2000);
		WebElement datas = before.driver.findElement(
				By.xpath("//*[@id=\"listaOpcoesFrete\"]"));
		
		before.geradorLog("Datas encontradas com sucesso.", "INFO"); //gera log
		String cepinfo = datas.getText();
		before.geradorLog("Imprimindo datas: \n ------Datas-------\n" + cepinfo+"\n-----------------", "INFO"); //gera log
		
		evidenciasPrint.main("cep4",before.diretorio,before.dataFormatada);
		Thread.sleep(1000);
		
	}

}
