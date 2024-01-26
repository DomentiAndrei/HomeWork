package Luma.LumaAuto.Tests;

import org.testng.annotations.Test;

import Luma.LumaAuto.Boss;
import Luma.LumaAuto.Elements.HomePage;
import Luma.LumaAuto.Elements.RegistrationPage;

public class RegistrationTest extends Boss {

	HomePage homePage;
	
	RegistrationPage registrationPage;
	@Test
	public void stepsToRegNewUser() {
		
		homePage = new HomePage();
		homePage.clickCreateAnAccount();
		
		registrationPage = new RegistrationPage();
		registrationPage.regNewUserProcessPositiveCase("Andrei", "Braga", "DomAndyy@mail.ru", "Test123!", "Test123!");
		
	}
}
