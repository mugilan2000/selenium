package resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductVerificationObjects {
	
	public static WebElement goToCart(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='sw-gtc']/span/a"));
	}
	
	public static List<WebElement> productCartVerification(WebDriver driver) {
		return driver.findElements(By.xpath("//*[@data-name='Active Items']"));
	}

}
