package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Login_Page;

public class Sign_in_Page {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www1.faronicsbeta.com/en/Account/Login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void testsignin()
	{
		Login_Page lp = new Login_Page(driver);
		lp.enterUserName("jaimatadi123@gmail.com");
		lp.clickNextbtn();
		lp.enterpassword("Aloha@123");
		lp.clickSignbtn();
		
	}
	
	@Test(priority=2)
	void computerpage()
	{
		Login_Page lp = new Login_Page(driver);
		lp.clickcomputerpage();
	}
	
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}
