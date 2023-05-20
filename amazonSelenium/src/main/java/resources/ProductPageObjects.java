package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageObjects {
	
	public static WebElement productPrice(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='corePrice_feature_div']"));
	}
	public static WebElement productAvailability(WebDriver driver) {
		return driver.findElement(By.id("availability"));
	}
	public static WebElement productQuantity(WebDriver driver) {
		return driver.findElement(By.id("quantity"));
	}
	public static WebElement addToCartProduct(WebDriver driver) {
		return driver.findElement(By.id("add-to-cart-button"));
	}
	public static WebElement extraProductSkipButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='attachSiNoCoverage']/span/input"));
	}
	public static WebElement productConfirmationMessage(WebDriver driver) {
		return driver.findElement(By.id("NATC_SMART_WAGON_CONF_MSG_SUCCESS"));
	}

}
