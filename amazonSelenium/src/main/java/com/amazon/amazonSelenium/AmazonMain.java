package com.amazon.amazonSelenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import jxl.read.biff.BiffException;
import resources.ExcelData;
import resources.GetDataUsingApachePOI;
import resources.HomePageObjects;
import resources.LoginPageObjects;
import resources.MainPageObjects;
import resources.ProductPageObjects;
import resources.ProductVerificationObjects;

public class AmazonMain {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {

		String productName = "sunway M3 Silicone LED Digital Black Men's Women's Watch";

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//		LoginPageObjects.signInOption(driver).click();
//		LoginPageObjects.emailAddress(driver).sendKeys("");
//		LoginPageObjects.continueButton(driver).click();
//		LoginPageObjects.password(driver).sendKeys("");
//		LoginPageObjects.signInButton(driver).click();


//		HomePageObjects.searchBox(driver).sendKeys("watches"+Keys.ENTER);
//		String resultMessage = HomePageObjects.resultMsg(driver).getText();
//		System.out.println(resultMessage);
//
//		Select select = new Select(MainPageObjects.filterDropdown(driver));
//		select.selectByVisibleText("Price: Low to High");
//		driver.findElement(By.id("s-result-sort-select_1")).click();
//
//		String parentWindow = driver.getWindowHandle();
//		
//		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector("h2"))));
//
//		int length = MainPageObjects.products(driver).size();
//		for(int i=0; i<length;i++)
//		{
//			List<WebElement> products = MainPageObjects.products(driver);
//			String txt = products.get(i).getText();
//			System.out.println("Product name fetched : "+txt);
//			if(txt.equals(productName))
//			{
//				wait.until(ExpectedConditions.visibilityOf(products.get(i).findElement(By.cssSelector("h2 a"))));
//				System.out.println("if section executed");
//				products.get(i).findElement(By.cssSelector("h2 a")).click();
//				break;
//			}
//
//		}
//		
//		Set<String> handles = driver.getWindowHandles();
//		for (String newWindow : handles) {
//			driver.switchTo().window(newWindow);
//		}
//		
//		System.out.println(ProductPageObjects.productPrice(driver).getText());
//		if(ProductPageObjects.productAvailability(driver).getText().equals("In stock"))
//		{
//			Assert.assertTrue(true);
//			System.out.println("Product is : "+ProductPageObjects.productAvailability(driver).getText());
//		}
//		else {
//			Assert.assertFalse(true);
//		}
//		
//		ProductPageObjects.productQuantity(driver);
//		Select select1 = new Select(ProductPageObjects.productQuantity(driver));
//		select1.selectByValue("2");
//		
//		ProductPageObjects.addToCartProduct(driver).click();
//		ProductPageObjects.extraProductSkipButton(driver).click();
//		if(ProductPageObjects.productConfirmationMessage(driver).getText().equals("Added to Cart"))
//		{
//			Assert.assertTrue(true);
//			System.out.println("Confirmation message : "+ProductPageObjects.productConfirmationMessage(driver).getText());
//		}
//		else
//		{
//			Assert.assertFalse(true);
//		}
		
//		ProductVerificationObjects.goToCart(driver).click();
//		int length1 = ProductVerificationObjects.productCartVerification(driver).size();
//		for(int i=0; i<=length1;i++)
//		{
//			List<WebElement> productsInCart = ProductVerificationObjects.productCartVerification(driver);
//			
//			if(i<length1)
//			{
//				String txt = productsInCart.get(i).getText();
//				System.out.println("Your Product is - "+txt);
//			}
//			else
//			{
//				System.out.println("Another one product is added, Please check");
//			}
//		}
		
		GetDataUsingApachePOI.getDataUsingApache();

	}

}
