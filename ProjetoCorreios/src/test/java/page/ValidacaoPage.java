package page;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;

public class ValidacaoPage {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void dadosEsperados(String logradouroEsperado, String bairroEsperado, String localidadeEsperada,
			String cepEsperado) {
		// Massa de Teste
		String logradouro = "Avenida dos Parques (Alphasítio)";
		String distrito = "Tamboré";
		String localidade = "Santana de Parnaíba/SP";
		String cep = "06544-300";

		metodo.newTab(1);
		By nome = By.xpath("//td[text()='" + logradouro + "']");
		By bairro = By.xpath("//td[text()='" + distrito + "']");
		By uf = By.xpath("//td[text()='" + localidade + "']");
		By ceP = By.xpath("//td[text()='" + cep + "']");
		metodo.validarTexto(nome, logradouroEsperado);
		metodo.validarTexto(ceP, cepEsperado);
		metodo.validarTexto(bairro, bairroEsperado);
		metodo.validarTexto(uf, localidadeEsperada);
		metodo.pausa(2000);
		metodo.fecharPagina();
		metodo.newTab(0);
		metodo.pausa(2000);
		metodo.apagarTexto();
		metodo.escrever(el.barraDeBusca, "Avenida dos Parques (Alphasítio)", "Buscando informacoes por logradouro ");
		metodo.clicar(el.lupaBusca, "clicando em buscar nome ");
		metodo.newTab(1);
		metodo.validarTexto(nome, logradouroEsperado);
		metodo.validarTexto(ceP, cepEsperado);
		metodo.validarTexto(bairro, bairroEsperado);
		metodo.validarTexto(uf, localidadeEsperada);
		metodo.pausa(2000);
		metodo.fecharPagina();
		metodo.newTab(0);
	}

}
