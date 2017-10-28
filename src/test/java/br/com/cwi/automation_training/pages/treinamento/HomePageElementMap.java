package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;

public class HomePageElementMap extends BasePage{
	
	@FindBy(id="contact-link")
	protected WebElement botaoContactUsHome;

}
