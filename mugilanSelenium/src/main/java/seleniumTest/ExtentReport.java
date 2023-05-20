
package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	WebDriver driver;
	ExtentReports extentReports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest testcase;
	
	@BeforeSuite
	public void initializeChrome()
	{
		extentReports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		extentReports.attachReporter(htmlReporter);
		driver = new ChromeDriver();
	}
	@Test
	public void openGoogle()
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
	@Test
	public void openBing()
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
	@Test
	public void openWikipedia()
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
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
		extentReports.flush();
	}

}
