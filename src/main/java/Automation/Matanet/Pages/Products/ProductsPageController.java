package Automation.Matanet.Pages.Products;

import static Automation.Matanet.DriverFactory.getChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPageController {
	private WebDriver driver = getChromeDriver();

	public int countNumberOfProducts() {
		List<WebElement> listOfProduct = driver.findElements(By.xpath("//div[@class=\"inventory_item\"]"));
		return listOfProduct.size();
	}
}
