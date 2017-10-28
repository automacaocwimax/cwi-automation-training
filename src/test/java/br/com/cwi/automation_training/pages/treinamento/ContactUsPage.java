package br.com.cwi.automation_training.pages.treinamento;

public class ContactUsPage extends ContactUsPageElementMap {

		
	public void selecionarSubjectHeading(){	
		moveToElement(SubjectHeading);
		SubjectHeading.click();
		logPrint("Clicou no botão Subject Heading");
	}
	
	public void selecionarCustomerService() {
		moveToElement(CustomerService);
		CustomerService.click();
		logPrint("Selecionado opção Customer Service");
	}
		
	public void preencherCampoEmail() {
		moveToElement(CampoEmail);
		CampoEmail.sendKeys("automacaotreinamento@gmail.com");
		logPrint("Campo Email preenchido");
		
	}
	
	public void preencherMensagem() {
		moveToElement(CampoMensagem);
		CampoMensagem.click();
		logPrint("Campo mensagem preenchido");
	}
		
	public void submetMensagem() {
		moveToElement(submeterMensagem);
		submeterMensagem.click();
		logPrint("");
	}
	
	public boolean mensagemFinalCorreta() {
		logPrint("Validou texto na tela");
		return mensagemFinal.getText()equals("")
	}
		
}
