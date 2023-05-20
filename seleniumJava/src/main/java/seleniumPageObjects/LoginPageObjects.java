package seleniumPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	@FindBy(id = "userEmail")
	public static WebElement userEmail;
	
	@FindBy(id = "userPassword")
	public static WebElement userPassword;
	
	@FindBy(id = "login")
	public static WebElement loginButton;

}
