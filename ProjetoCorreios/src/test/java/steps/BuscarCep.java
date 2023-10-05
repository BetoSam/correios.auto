package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import navegadores.Navegadores;
import page.ValidacaoPage;

public class BuscarCep {
	ValidacaoPage vpage = new ValidacaoPage();
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@Given("que esteja na home")
	public void queEstejaNaHome() {
		Navegadores.abrirNavegador();

	}

	@When("informar um cep valido")
	public void informarUmCepValido() {
		metodo.escrever(el.barraDeBusca, "06544-300", "Buscar cep ");
	}

	@When("clicar na lupa de busca")
	public void clicarNaLupaDeBusca() {
		metodo.clicar(el.lupaBusca, "clicando em buscar cep");
	}

	@Then("o sistema devera  as informacoes do cep informado")
	public void oSistemaDeveraAsInformacoesDoCepInformado() {
		// Dados Encontradados
		String logradouroEsperada = "Avenida dos Parques (Alphasítio)";
		String cepEsperadoEsperado = "06544-300";
		String bairroEsperadoEsperado = "Tamboré";
		String localidadeEsperadaEsperado = "Santana de Parnaíba/SP";
		vpage.dadosEsperados(logradouroEsperada, bairroEsperadoEsperado, localidadeEsperadaEsperado,
				cepEsperadoEsperado);
	}

	@Given("clicar em aceitar cookies")
	public void clicarEmAceitarCookies() {
		metodo.clicar(el.btnCookies, "Aceitar Coockies");
		metodo.scroll(250);
	}

}
