package Automation.Matanet.Pages.Products;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Automation.Matanet.Pages.Login.LoginPage;

public class ProductPageTest extends BaseTestClass {
	private static final String USER_NAME = "standard_user";
	private static final String PASSWORD = "secret_sauce";
	private static final String ID = "login-button";

	private ProductsPage productPage = ProductsPage.getProductsPage();
	private LoginPage loginPage = LoginPage.getLoginPage();

	@Test
	public void testCountNumberOfProductsEqual6() {
		loginPage.act().inputUsername(USER_NAME);
		loginPage.act().inputPassword(PASSWORD);
		loginPage.act().clickLoginById(ID);

		int actualNumber = productPage.act().countNumberOfProducts();
		int expectedResult = 6;

		assertEquals(actualNumber, expectedResult);
	}
}
