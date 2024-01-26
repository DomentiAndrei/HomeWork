package Luma.LumaAuto;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonFunction extends Boss { 

	static Actions act;
	
	static public void getAction(WebElement element) {

		act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	
	
}
