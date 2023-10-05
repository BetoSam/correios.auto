package page;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;

public class ValidacaoPage {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void dadosEsperado(String logradouro, String distrito, String localidade, String cep) {

		metodo.newTab(1);
		By nome = By.xpath("//td[text()='" + logradouro + "']");
		By bairro = By.xpath("//td[text()='" + distrito + "']");
		By uf = By.xpath("//td[text()='" + localidade + "']");
		By ceP = By.xpath("//td[text()='" + cep + "']");
		metodo.validarTexto(nome, logradouro);
		metodo.validarTexto(ceP, cep);
		metodo.validarTexto(bairro, distrito);
		metodo.validarTexto(uf, localidade);
		metodo.pausa(2000);
		metodo.fecharPagina();
		metodo.newTab(0);
		metodo.pausa(2000);
		metodo.apagarTexto();
		metodo.escrever(el.barraDeBusca, "Avenida dos Parques (Alphasítio)", "Buscando informacoes por logradouro ");
		metodo.clicar(el.lupaBusca, "clicando em buscar nome ");
		metodo.newTab(1);
		metodo.validarTexto(nome, logradouro);
		metodo.validarTexto(ceP, cep);
		metodo.validarTexto(bairro, distrito);
		metodo.validarTexto(uf, localidade);
		metodo.pausa(2000);
		metodo.fecharPagina();

	}

}
