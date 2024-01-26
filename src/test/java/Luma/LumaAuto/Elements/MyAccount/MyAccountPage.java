package Luma.LumaAuto.Elements.MyAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.LumaAuto.Boss;

public class MyAccountPage extends Boss{

	
	
	@FindBy(xpath = "//a[contains(text(),'Change Password')]")
	WebElement changePassword;
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickChangePassword() {
		changePassword.click();
		log.info("changePassword clicked");
	}
}
