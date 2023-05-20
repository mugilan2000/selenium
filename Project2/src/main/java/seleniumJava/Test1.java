package seleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Test1 {

	static WebDriver driver;
	static ExtentReports extentReports;
	static ExtentHtmlReporter htmlReporter;
	static ExtentTest testcase;
	
	public static void main(String[] args) {
		
		initializeChrome();
		openGoogle();
		openBing();
		openWikipedia();
		closeBrowser();

	}
	
	
	public static void initializeChrome()
	{
		extentReports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		extentReports.attachReporter(htmlReporter);
		driver = new ChromeDriver();
	}
	
	public static void openGoogle()
	{
		testcase = extentReports.createTest("verify google title");
		testcase.log(Status.INFO, "Going to open google");
		driver.get("https://www.google.com/");
		testcase.log(Status.INFO, "get the title of the page");
		String title = driver.getTitle();
		testcase.log(Status.INFO, "grabed title is"+title);
		if(title.equalsIgnoreCase("google"))
		{
			testcase.log(Status.PASS, "Testcase Passed with expected result");
		}
		else
		{
			testcase.log(Status.FAIL, "Testcase Failed");
		}
	}
	
	public static void openBing()
	{
		testcase = extentReports.createTest("verify bing title");
		testcase.log(Status.INFO, "Going to open bing");
		driver.get("https://www.bing.com/");
		testcase.log(Status.INFO, "get the title of the page");
		String title = driver.getTitle();
		testcase.log(Status.INFO, "grabed title is"+title);
		if(title.equals("bing"))
		{
			testcase.log(Status.PASS, "Testcase Passed with expected result");
		}
		else
		{
			testcase.log(Status.FAIL, "Testcase Failed");
		}
	}
	
	public static void openWikipedia()
	{
		testcase = extentReports.createTest("verify wikipedia title");
		testcase.log(Status.INFO, "Going to open wikipedia");
		driver.get("https://www.wikipedia.org/");
		testcase.log(Status.INFO, "get the title of the page");
		String title = driver.getTitle();
		testcase.log(Status.INFO, "grabed title is"+title);
		if(title.equals("wikipedia"))
		{
			testcase.log(Status.PASS, "Testcase Passed with expected result");
		}
		else
		{
			testcase.log(Status.FAIL, "Testcase Failed");
		}
	}
	
	public static void closeBrowser()
	{
		driver.close();
		extentReports.flush();
	}
}
