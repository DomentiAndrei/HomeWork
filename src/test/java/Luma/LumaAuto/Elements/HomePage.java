package Luma.LumaAuto.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.LumaAuto.Boss;

public class HomePage extends Boss {

	
	
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	WebElement signIn;
	
	@FindBy(xpath = "//a[contains(text(),'Create an Account')]")
	WebElement createAnAccount;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickSignInButton() {
		signIn.click();
		log.info("SignIn button clicked");
	}
	
	public void clickCreateAnAccount() {
		createAnAccount.click();
		log.info("createAnAccount button clicked");
	}
}
