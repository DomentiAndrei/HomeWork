package Luma.LumaAuto.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.LumaAuto.Boss;
import org.junit.Assert;

public class RegistrationPage extends Boss {

	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='email_address']")
	WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='password-confirmation']")
	WebElement passwordConfirmation;
	
	@FindBy(xpath = "//span[contains(text(),'Create an Account')]")
	WebElement createAnAccount;
	
	@FindBy(xpath = "//div[contains(text(),'Thank you for registering with Main Website Store.')]")
	WebElement confMessage;
	
	@FindBy(xpath = "//body/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]")
	WebElement messageUniqueEmail;
	
	
	
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	public void insertFirstname(String firstnameValue) {
		firstname.sendKeys(firstnameValue);
		log.info("firstname inserted");
		Assert.assertEquals(firstname.isDisplayed(), true);
	}
	
	public void insertLastname(String lastnameValue) {
		lastname.sendKeys(lastnameValue);
		log.info("lastnameValue inserted");
		Assert.assertEquals(lastname.isDisplayed(), true);
	}
	
	public void insertEmail(String emailValue) {
		emailAddress.sendKeys(emailValue);
		log.info("emailValue inserted");
		Assert.assertEquals(emailAddress.isDisplayed(), true);
	}
	
	public void insertPassword(String passwordValue) {
		password.sendKeys(passwordValue);
		log.info("password inserted");
		Assert.assertEquals(password.isDisplayed(), true);
	}
	
	public void insertPasswordConfirmation(String passwordConfirma) {
		passwordConfirmation.sendKeys(passwordConfirma);
		log.info("passwordConfirmation inserted");
		Assert.assertEquals(passwordConfirmation.isDisplayed(), true);
	}
	public void clickCreateAnAccount() {
		createAnAccount.click();
		log.info("createAnAccount clicked");
	}
	public void checkConfMessage() {
		Assert.assertEquals("Thank you for registering with Main Website Store.", confMessage.getText());
		Assert.assertEquals(confMessage.isDisplayed(), true);
	}
	
	public void checkMessageUniqueEmail() {
		Assert.assertEquals(messageUniqueEmail.isDisplayed(), true);
		
	}
	
	public void regNewUserProcessPositiveCase(String firstnameValue, String lastnameValue , String emailValue, String passwordValue, String passwordConfirmation) {
		this.insertFirstname(firstnameValue);
		this.insertLastname(lastnameValue);
		this.insertEmail(emailValue);
		this.insertPassword(passwordValue);
		this.insertPasswordConfirmation(passwordConfirmation);
		this.clickCreateAnAccount();
		this.checkConfMessage();
	}
	
	public void regNewUserProcessNegativeCase(String firstnameValue, String lastnameValue , String emailValue, String passwordValue, String passwordConfirmation) {
		this.insertFirstname(firstnameValue);
		this.insertLastname(lastnameValue);
		this.insertEmail(emailValue);
		this.insertPassword(passwordValue);
		this.insertPasswordConfirmation(passwordConfirmation);
		this.clickCreateAnAccount();
		this.checkMessageUniqueEmail();
	}
	
	
}
