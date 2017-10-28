package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;

public class HomePage extends HomePageElementMap {
	
	public HomePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
		public void ClicarNoBotaoContact(){
		moveToElement(botaoContactUsHome);
		botaoContactUsHome.click();
		logPrint("Acessou pagina de contato");
	}

}
