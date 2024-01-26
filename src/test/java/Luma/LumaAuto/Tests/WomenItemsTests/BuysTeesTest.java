package Luma.LumaAuto.Tests.WomenItemsTests;

import org.testng.annotations.Test;

import Luma.LumaAuto.Boss;
import Luma.LumaAuto.CommonWebElements;
import Luma.LumaAuto.Elements.HomePage;
import Luma.LumaAuto.Elements.LogInPage;
import Luma.LumaAuto.Elements.UpperBar;
import Luma.LumaAuto.Elements.Women.Tops.TeesPage;

public class BuysTeesTest extends Boss {

	HomePage homePage;
	LogInPage logInPage;

	UpperBar upperBar;

	TeesPage teesPage;
	CommonWebElements commonWebElements;

	@Test
	public void BuyAnItemSteps() {

		homePage = new HomePage();
		homePage.clickSignInButton();

		logInPage = new LogInPage();
		logInPage.logInProcess("DomAndy.92@mail.ru", "qwe123@1");

		upperBar = new UpperBar();

		upperBar.hoverWomen();
		upperBar.hoverTops();
		upperBar.clickTees();

		teesPage = new TeesPage();
		teesPage.clickDesireeFitnessTee();

		commonWebElements = new CommonWebElements();

		commonWebElements.clickMsize();

		CommonWebElements.clickAddToCart();

	}
}
