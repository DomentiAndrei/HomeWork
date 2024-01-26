package Luma.LumaAuto.Tests;

import org.testng.annotations.Test;

import Luma.LumaAuto.Boss;
import Luma.LumaAuto.Elements.HomePage;
import Luma.LumaAuto.Elements.RegistrationPage;

public class RegistrationNegativeTest extends Boss {

	HomePage homePage;
	RegistrationPage registrationPage;

	@Test
	public void stepsToRegNegativeCase() {

		homePage = new HomePage();
		homePage.clickCreateAnAccount();

		registrationPage = new RegistrationPage();
		registrationPage.regNewUserProcessNegativeCase("Andrei", "Braga", "rgreg@mail.ru", "Test123!", "Test123!");

	}

}
