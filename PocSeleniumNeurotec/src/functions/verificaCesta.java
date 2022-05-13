package functions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class verificaCesta {
	
	@Test
	public static void verCesta() throws Exception{
		Thread.sleep(1000);
		
		evidenciasPrint.main("validaCesta1",before.diretorio,before.dataFormatada);
		before.geradorLog("Procurando botao 'ir para o carrinho'.","INFO");
		before.driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div[3]/button[2]")).click();
		before.geradorLog("Botao clicado com sucesso.","INFO");
		
		
		before.geradorLog("Procurando itens.","INFO");
		Thread.sleep(1000);
		WebElement listaItens = before.driver.findElement(By.xpath("//*[@id=\"sellersContainer\"]/div/div/div/div"));
		
		before.geradorLog("Listando itens do carrinho.","INFO");
		before.geradorLog("------itens do carrinho------\n" + listaItens.getText() + "\n------fim itens do carrinho------","INFO");
	
		Thread.sleep(1000);
		evidenciasPrint.main("validaCesta2",before.diretorio,before.dataFormatada);
		
		
	}
}
