package Luma.LumaAuto.Tests;

import org.testng.annotations.Test;

import Luma.LumaAuto.Boss;
import Luma.LumaAuto.Elements.HomePage;
import Luma.LumaAuto.Elements.LogInPage;

public class LogInTest extends Boss{

	HomePage homePage;
	LogInPage logInPage;
	@Test
	public void stepsToRep() {
		
		
		homePage = new HomePage();
		homePage.clickSignInButton();
		
		
		logInPage = new LogInPage();
		logInPage.logInProcess("DomAndy.92@mail.ru", "Armagidon1!");
		
		
		
	}
}
