package Luma.LumaAuto;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonWebElements extends Boss{

		
		
		@FindBy(xpath = "//div[@option-id='166']")
		static
		WebElement xsSize;
		
		@FindBy(xpath = "//div[@option-id='167']")
		static
		WebElement sSize;
		
		@FindBy(xpath = "//div[@option-id='168']")
		
		WebElement mSize;
		
		@FindBy(xpath = "//div[@option-id='169']")
		static
		WebElement lSize;
		
		@FindBy(xpath = "//div[@option-id='170']")
		static
		WebElement xlSize;
		
		@FindBy(xpath = "//div[@option-id='170']")
		static
		WebElement addToCart;
		
		
		
		public CommonWebElements() {
			PageFactory.initElements(driver, this);
		}
		
		public static void clickXSSize() {
			xsSize.click();
			log.info("xsSize clicked");
		}
		
		public static void clickSsize() {
			sSize.click();
			log.info("sSize clicked");
		}
		
		public  void clickMsize() {
			mSize.click();
			log.info("mSize clicked");
		}
		
		public static void clickLsize() {
			lSize.click();
			log.info("lSize clicked");
		}
		
		public static void clickXLsize() {
			xlSize.click();
			log.info("xlSize clicked");
		}
		
		public static void clickAddToCart() {
			addToCart.click();
			log.info("addToCart clicked");
		}
	
	
	
}
