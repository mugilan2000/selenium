package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for (WebElement link : links) {
			
			String url = link.getAttribute("href");
			
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int responceCode = con.getResponseCode();
			System.out.println(responceCode);
			
			a.assertTrue(responceCode<400, "link is with text "+link.getText()+"with status code "+responceCode);
		
		//String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		
	}
	a.assertAll();

}
}