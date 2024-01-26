package Luma.LumaAuto.Elements.MyAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.LumaAuto.Boss;

public class AccountInformationPage extends Boss {

	@FindBy(xpath = "//input[@id='current-password']")
	WebElement currentPassword;

	@FindBy(xpath = "//input[@id='password']")
	WebElement newPassword;

	@FindBy(xpath = "//input[@id='password-confirmation']")
	WebElement newPasswordConf;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement save;
	
	
	public AccountInformationPage() {
		PageFactory.initElements(driver, this);
	}

	public void insertCurrentPass(String currentPass) {
		currentPassword.sendKeys(currentPass);
		log.info("currentPassword inserted");
	}

	public void insertNewPass(String newPass) {
		newPassword.sendKeys(newPass);
		log.info("newPassword inserted");
	}

	public void insertNewPassConf(String newPassConf) {
		newPasswordConf.sendKeys(newPassConf);
		log.info("newPasswordConf inserted");
	}
	
	public void clickSave() {
		save.click();
		log.info("save clicked, pass was changed successfully");
	}

	public void changePassProcess(String currentPass, String newPass, String newPassConf) {
		this.insertCurrentPass(currentPass);
		this.insertNewPass(newPass);
		this.insertNewPassConf(newPassConf);
		this.clickSave();
	}
}
