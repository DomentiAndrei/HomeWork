package Luma.LumaAuto.Tests;

import org.testng.annotations.Test;

import Luma.LumaAuto.Boss;
import Luma.LumaAuto.Elements.HomePage;
import Luma.LumaAuto.Elements.LogInPage;
import Luma.LumaAuto.Elements.UpperMenu;
import Luma.LumaAuto.Elements.MyAccount.AccountInformationPage;
import Luma.LumaAuto.Elements.MyAccount.MyAccountPage;

public class ChangePasswordTest extends Boss {

	HomePage homePage;
	LogInPage logInPage;
	UpperMenu upperMenu;
	AccountInformationPage accountInformationPage;
	
	MyAccountPage myAccountPage;
	@Test
	public void changePassSteps() {
		
		
		homePage = new HomePage();
		homePage.clickSignInButton();
		
		
		logInPage = new LogInPage();
		logInPage.logInProcess("DomAndy.92@mail.ru", "qwe123@1");
		
		upperMenu = new UpperMenu();
		upperMenu.actionUpMenu();
		upperMenu.clickMyAccount();
		
		
		myAccountPage = new MyAccountPage();
		myAccountPage.clickChangePassword();
		
		
		accountInformationPage = new AccountInformationPage();
		accountInformationPage.changePassProcess("qwe123@1", "NewPass12@", "NewPass12@");
		
		upperMenu.clickDropMenu();
		upperMenu.clickSingOut();
		
		homePage.clickSignInButton();
		 
		logInPage.logInProcess("DomAndy.92@mail.ru", "NewPass12@");
		
		
		
		
		
		
	}
}
