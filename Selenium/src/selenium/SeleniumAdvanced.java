package selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumAdvanced {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/tables']")).click();
		
		driver.findElement(By.xpath("//table[@id='table1']//tr//th[1]")).click();
		
		List<WebElement> listOfElements = driver.findElements(By.xpath("//table[@id='table1']//tr//td[1]"));
		
		List<String> originalList = listOfElements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));

	}

}
