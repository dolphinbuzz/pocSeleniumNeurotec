package functions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class homePage {
	
	
	@Test
	public static void test() throws Exception  {
		
		String url = "https://www.kabum.com.br/";
		//Acessando Site da Americanas
		before.driver.get(url); 
		before.driver.manage().window().maximize();
		before.geradorLog("Home do site "+url+" acessada com sucesso.", "INFO"); //gera log
		
		Thread.sleep(1000);
		//String nome = "home";
		evidenciasPrint.main("home",before.diretorio,before.dataFormatada);
		
		//aceitando coockies
		before.driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		before.geradorLog("Cookies aceitado com sucesso.", "INFO"); //gera log
	}


}
