package seleniumHandson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumPageObjects.LoginPageObjects;

public class LoginPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userEmail.sendKeys("mugimugilan656@gmail.com");
		LoginPageObjects.userPassword.sendKeys("Mugilan22@");
		LoginPageObjects.loginButton.click();
		
//		LoginPageObjects.userEmail(driver).sendKeys("mugimugilan656@gmail.com");
//		LoginPageObjects.userPassword(driver).sendKeys("Mugilan22@");
//		LoginPageObjects.loginButton(driver).click();

	}

}
