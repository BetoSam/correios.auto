package metodos;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.out.println("Erro ao escrever no passo " + passo);
			System.out.println("causa de erro" + e.getCause());
		}

	}

	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("Erro ao clicar  no passo " + passo);
			System.out.println("causa de erro" + e.getCause());
		}

	}

	public void validarTexto(By elemento, String texto) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(texto, textoCapturado);

	}

	public void validaTitle(String titulo) {
		assertEquals(titulo, driver.getTitle());

	}

	public void scroll(int qtdScroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + qtdScroll + ")", "");
	}

	public void fecharPagina() {
		driver.close();

	}

	public void apagarTexto() {
		WebElement elemento = driver.findElement(By.id("relaxation"));
		elemento.sendKeys("06544-300");

		// Limpando o campo ""Busca
		elemento.clear();
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void newTab(int tabs) {
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(tabs));
	}
}