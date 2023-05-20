package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public static WebElement signInOption(WebDriver driver) {
		return driver.findElement(By.id("nav-link-accountList"));
	}
	public static WebElement emailAddress(WebDriver driver) {
	    return driver.findElement(By.id("ap_email"));
	}
	public static WebElement continueButton(WebDriver driver) {
		return driver.findElement(By.id("continue"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("ap_password"));
	}
	public static WebElement signInButton(WebDriver driver) {
		return driver.findElement(By.id("signInSubmit"));
	}

}
