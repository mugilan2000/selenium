package resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObjects {
	
	public static WebElement filterDropdown(WebDriver driver) {
		return driver.findElement(By.id("s-result-sort-select"));
	}
	public static WebElement filterConfirmation(WebDriver driver) {
		return driver.findElement(By.id("a-autoid-2-announce"));
	}
	public static WebElement brandSeeMore(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@aria-label='See more, Brands']"));
	}
	public static List<WebElement> products(WebDriver driver) {
		return driver.findElements(By.cssSelector("h2"));
	}

}
