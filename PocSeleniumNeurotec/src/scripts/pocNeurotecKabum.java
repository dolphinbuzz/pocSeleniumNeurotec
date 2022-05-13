package scripts;

import org.junit.jupiter.api.Test;
import functions.*;

public class pocNeurotecKabum {

	//Funcao para acessar a home page do site.

	@Test
	public void pocNeurotecKabumSelenium() throws Exception{
		//before
		before.test();

		//tests
		
		homePage.test();						//1- Acessar o site www.americanas.com
		busca_item.test();						//2- Buscar por "console ps4"
		selecionaItem.test();					//3- Selecionar o Primeiro console
		incluiCep.addCep();						//4- Digitar o CEP e imprimir os valores dos fretes disponíveis
		fechaCEP.test();						//5- Fecha POP CEP
		clicaComprar.clickCompra();				//6- Clicar em comprar
		//selecionaGarantia.selectGarantia();		//7- Selecionar garantia +12meses
		//clicaContinua.clickContinue();			//8- Clicar em continuar
		verificaCesta.verCesta();				//9- Verificar se o produto se encontra na cesta

		//after 
		after.tearDown();
	}
}
