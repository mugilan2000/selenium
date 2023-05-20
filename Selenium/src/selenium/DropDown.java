package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropdown1);
		
		List<WebElement> optionSize = select.getOptions();
		int size = optionSize.size();
		
		
		for(int i=0; i<size; i++)
		{
			select.selectByIndex(i);
		}
		
		select.selectByValue("option1");
		select.selectByVisibleText("Select");
	}

}
