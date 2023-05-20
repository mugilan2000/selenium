import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class main {

	public static void main(String[] args) {
		
		int n=10;
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		
		StringBuilder sb = new StringBuilder(n);
		for(int i=0;i<n;i++)
		{
			int index = (int) (AlphaNumericString.length()*Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		
		String password = sb.toString();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mugilanmsm.epizy.com/");
		
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.name("username")).sendKeys("Mugilanmsm");
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Click here to Login")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.name("email")).sendKeys("mugimugilan656@gmail.com");
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.name("username")).sendKeys("Mugilanmsm");
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		String username = driver.findElement(By.tagName("h4")).getText();
		System.out.println(username);
		driver.findElement(By.id("about")).click();
		String about = driver.findElement(By.tagName("p")).getText();
		System.out.println(about);
		
		driver.findElement(By.id("contact")).click();
		driver.findElement(By.id("name")).sendKeys("Mugilan");
		driver.findElement(By.id("email")).sendKeys("mugimugilan656@gmail.com");
		driver.findElement(By.id("mobilenumber")).sendKeys("6381103890");
		driver.findElement(By.id("message")).sendKeys("Have a nice day");
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/p[1]")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/p[2]")).getText());
		
		driver.findElement(By.id("submit_form")).click();
		
		System.out.println(driver.findElement(By.tagName("h4")).getText());
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.findElement(By.tagName("a")).click();
	}

}
