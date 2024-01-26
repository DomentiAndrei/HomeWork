package Luma.LumaAuto.Elements;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.LumaAuto.Boss;

public class UpperMenu extends Boss{

	
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement dropMenu;
	
	@FindBy(xpath = "//span[@class='logged-in']")
	WebElement welcome;
	
	
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	WebElement myAccount;
	
	@FindBy(xpath = "//a[contains(text(),'My Wish List ')]")
	WebElement myWishList;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	WebElement singOut;
	
	public UpperMenu() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickDropMenu() {
		dropMenu.click();
		log.info("menu opened");
	}
	
	public void clickMyAccount() {
		myAccount.click();
		log.info("myAccount clicked");
	}
	
	public void clickSingOut() {
		singOut.click();
		log.info("singOut clicked");
	}
	
	
	public void checkWelcome() {
	
		Assert.assertEquals(welcome.isDisplayed(), true);
		Assert.assertEquals(welcome.getText(), "Welcome, Andrei Domenti!");
	}
	
	public void actionUpMenu() {
		this.clickDropMenu();
		this.checkWelcome();
	}
	
	
}
