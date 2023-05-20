package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/");
		
		System.out.println("Above link is opened in chrome browser");
		
		System.out.println("Link Title : " + driver.getTitle());
		System.out.println("URL - "+ driver.getCurrentUrl());
		
		driver.close();
		
	}

}
