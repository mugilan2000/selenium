package selenium;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.findElement(By.xpath("//li[@id='menuform:j_idt39']/a")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_overlay']/a")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		
		
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		driver.switchTo().alert().sendKeys("mugilan");
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			
			driver.switchTo().window(newWindow);
			
		}
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt111']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']//a[1]")).click();

	}

}
