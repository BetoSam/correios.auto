package navegadores;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegadores extends DriversFactory {

	public static void abrirNavegador() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.correios.com.br/");
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Erro abrir navegador ");
			System.out.println("causa de erro" + e.getCause());
		}
	}

	public void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Erro abrir navegador ");
			System.out.println("causa de erro" + e.getCause());
		}
	}
}
