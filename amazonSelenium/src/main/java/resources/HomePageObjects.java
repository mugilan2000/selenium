package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public static WebElement searchBox(WebDriver driver) {
		return driver.findElement(By.id("twotabsearchtextbox"));
	}
	
	public static WebElement resultMsg(WebDriver driver) {
		return driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']/div/div[1]/div/div"));
	}

}
