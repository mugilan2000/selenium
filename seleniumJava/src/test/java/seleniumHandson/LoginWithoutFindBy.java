package seleniumHandson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithoutFindBy {
	
	public static WebElement userEmail;
	public static WebElement userPassword;
	public static WebElement login;
	
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		
		userEmail.sendKeys("mugimugilan656@gmail.com");
		userPassword.sendKeys("Mugilan22@");
		login.click();
		
	}

}
