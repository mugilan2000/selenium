package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		System.out.println("Radio1 is clicked");

		//checkbox

		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();

		if(driver.findElement(By.id("checkBoxOption3")).isSelected())
		{
			System.out.println("checkbox option3 is selected");
		}
		else
		{
			System.out.println("checkbox option3 is not selected");
		}

	}

}
