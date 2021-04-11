package Automation.Matanet.Pages.Products;

import static Automation.Matanet.DriverFactory.getChromeDriver;
import static Automation.Matanet.DriverFactory.getWebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTestClass {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeSuite
	public void startUpBrowser() {

		driver = getChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		wait = getWebDriverWait();
	}

	@BeforeMethod
	public void openURL() {
		driver.get("https://www.saucedemo.com/");
	}

	@AfterSuite(alwaysRun = true)
	public void closeBrowser() {
		driver.close();
	}
}
