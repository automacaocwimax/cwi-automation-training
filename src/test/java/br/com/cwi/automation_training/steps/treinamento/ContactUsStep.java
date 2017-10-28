package br.com.cwi.automation_training.steps.treinamento;

import br.com.cwi.automation_training.pages.treinamento.ContactUsPage;
import br.com.cwi.automation_training.pages.treinamento.HomePage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.es.Dado;
import cucumber.api.java.gl.E;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class ContactUsStep {

	@Dado("que estou na homepage do site \"(.*)\"")
		public void acessaHomePage(String url) {
			TestRule.openApplicationChrome(url);
	}
	
	@Quando("clico no botão \"Contact Us\"")
		public void clicarBotaoContact() {
			HomePage homePage = new HomePage();
			homePage.ClicarNoBotaoContact();
			}
	
	@E("clicar no botão Subject Heading no campo \"id_contact\"")
	public void clicarCustomerService() {
		ContactUsPage contactUsPage = new ContactUsPage();
		contactUsPage.selecionarCustomerService();
	}
	
	@E("selecionar a opção \"selector focus hover\"")
		public void clicarBotaoSubjet() {
			ContactUsPage contactUsPage = new ContactUsPage();
			contactUsPage.selecionarSubjectHeading();
	}
	
	@E("inserir o email \"automacaotreinamento@gmail.com\" no campo \"email\"")
		public void inserirEmail() {
			ContactUsPage contactUsPage = new ContactUsPage();
			contactUsPage.preencherCampoEmail();
				}
	
	@E("inserir o texto \"Teste\" no campo \"message\"")
	public void inserirMensagem() {
		ContactUsPage contactUsPage = new ContactUsPage();
		contactUsPage.preencherMensagem();
			}

	@E("clicar no campo \"submitMessage\"")
	public void clicarSubmit() {
		ContactUsPage contactUsPage = new ContactUsPage();
		contactUsPage.submetMensagem();
			}
	
	@Entao("irá confirmar o envio com a mensagem \"alert alert-success\"")
	public void validarMensagemFinal() {
		ContactUsPage contactUsPage = new ContactUsPage();
		Assert.assertTrue("Titulo exibido esta incorreto!!!", quemSomosPage.tituloDaPaginaEstaCorreto());
	}
}
