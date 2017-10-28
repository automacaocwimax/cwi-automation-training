package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;

public class ContactUsPageElementMap extends BasePage{
	
	@FindBy(xpath = "//*[@class='form-control']")
	protected WebElement SubjectHeading;
	
	@FindBy(xpath = "//*[@class='selector focus hover']")
	protected WebElement CustomerService;

	@FindBy(xpath = "//*[@class='form-control grey validate']")
	protected WebElement CampoEmail;
	
	@FindBy(id="message")
	protected WebElement CampoMensagem;

	@FindBy(id="submitMessage")
	protected WebElement submeterMensagem;
	
	
}
