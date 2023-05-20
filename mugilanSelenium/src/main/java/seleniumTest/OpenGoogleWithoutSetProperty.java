package seleniumTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenGoogleWithoutSetProperty {

	public static void main(String[] args) {
		
		//chromedriver path is mentioned in env variables so system.setProperty is not need.
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com/");
		
		//driver.manage().window().maximize();
		
//		Dimension dimension = new Dimension(800, 700);
//		driver.manage().window().setSize(dimension);
		
		

	}

}
