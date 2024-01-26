package Luma.LumaAuto.Elements.Women.Tops;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.LumaAuto.Boss;

public class TeesPage extends Boss{

	
	
	@FindBy(xpath = "//a[contains(text(),'Desiree Fitness Tee')]")
	WebElement desireeFitnessTee;
	
	public TeesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickDesireeFitnessTee() {
		desireeFitnessTee.click();
		log.info("desireeFitnessTee clicked");
	}
	

	
}
