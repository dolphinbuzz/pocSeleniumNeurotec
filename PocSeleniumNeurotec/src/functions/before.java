package functions;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class before {

	public static WebDriver driver;
	public static String dataFormatada;
	public static String diretorio;
	
	
	@BeforeClass
	public static void test() throws Exception  {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(opt);
		//evidenciasPrint.criaDiretorio();
		
		Date data = new Date();
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
		
		dataFormatada = dataFormat.format(data);
		diretorio = ("C:\\workspace\\PocSeleniumNeurotec\\Evidencias\\" + dataFormatada);
		new File(diretorio).mkdir();
		geradorLog("Inicio da execuçao","INFO");
		

	}
	public static String geraLog;
	
	public static void geradorLog(String logInfo, String lvl) throws Exception{
		//arquivo de log
		try {
			
		FileWriter arq = new FileWriter(diretorio + "\\"+ dataFormatada + ".txt", true);
		BufferedWriter writer = new BufferedWriter(arq);
		
	
		writer.write("[" + dataFormatada + "]"+"[" + lvl + "] - "+  logInfo + "\n");
		writer.flush();
		writer.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}






