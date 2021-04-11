package Automation.Matanet.Pages.Login;

import static Automation.Matanet.DriverFactory.getChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageController {
	private WebDriver driver = getChromeDriver();

	public void inputUsername(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);
	}

	public void inputPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	public void clickLoginById(String id) {
		WebElement login = driver.findElement(By.id(id));
		login.click();
	}
}
