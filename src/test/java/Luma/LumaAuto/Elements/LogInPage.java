package Luma.LumaAuto.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.LumaAuto.Boss;

public class LogInPage extends Boss {

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@title='Password']")
	WebElement password;

	@FindBy(xpath = "//button[@name='send']")
	WebElement signIn;
	
	@FindBy(xpath = "//span[contains(text(),'Forgot Your Password?')]")
	WebElement forgotYourPassword;

	@FindBy(xpath = "//span[contains(text(),'Create an Account')]")
	WebElement createAnAccount;
	
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	public void insertEmail(String emailValue) {
		email.sendKeys(emailValue);
		log.info("email inserted");
	}

	public void insertPassword(String passValue) {
		password.sendKeys(passValue);
		log.info("password inserted");
	}

	public void clickSignInButton() {
		signIn.click();
		log.info("signIn button clicked");
	}
	public void clickForgotYourPasswordButton() {
		forgotYourPassword.click();
		log.info("forgotYourPassword button clicked");
	}
	
	public void clickCreateAnAccount() {
		createAnAccount.click();
		log.info("createAnAccount button clicked");
	}
	
	public void logInProcess(String emailValue, String passValue) {
		this.insertEmail(emailValue);
		this.insertPassword(passValue);
		this.clickSignInButton();
	}
	
	
	
	
}
