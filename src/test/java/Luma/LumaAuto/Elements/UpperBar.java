package Luma.LumaAuto.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.LumaAuto.Boss;
import Luma.LumaAuto.CommonFunction;

public class UpperBar extends Boss{

	
	
	@FindBy(xpath = "//a[@id='ui-id-4']")
	WebElement women;
	
	@FindBy(xpath = "//a[@id='ui-id-9']")
	WebElement tops;
	
	@FindBy(xpath = "//a[@id='ui-id-13']")
	WebElement tees;
	
	public UpperBar() {
		PageFactory.initElements(driver, this);
	}
	
	public void hoverWomen() {
		CommonFunction.getAction(women);
		log.info("women hovered ");
	}
	
	public void hoverTops() {
		CommonFunction.getAction(tops);
		log.info("women hovered ");
	}
	public void clickTees() {
		tees.click();
		log.info("Tees clicked ");
	}
	
	
}
