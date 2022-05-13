package functions;

import org.junit.AfterClass;

public class after {

	
	@AfterClass
	public static void tearDown()throws Exception{
		before.driver.close();
		before.geradorLog("Fim da execução, teste executado com sucesso", "INFO");
    }

}
