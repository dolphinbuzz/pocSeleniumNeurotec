package functions;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class evidenciasPrint {



	public static void main(String imageTest,String diretorio,String dataFormatada) throws Exception {

		before.geradorLog("Foi tirado um print da tela.","INFO");
		
		try {
			Robot robot = new Robot();
			// Captura o screen shot da área definida pelo retângulo
			BufferedImage bi=robot.createScreenCapture(new Rectangle(1920,1080));

			ImageIO.write(bi, "jpg", new File(diretorio+ "\\" + dataFormatada +"_" + imageTest + ".jpg"));

		} catch (AWTException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}



