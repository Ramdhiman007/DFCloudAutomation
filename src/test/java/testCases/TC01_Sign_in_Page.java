package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Locators_Class;
import testBase.Base_Page;

public class TC01_Sign_in_Page extends Base_Page {
    
    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        driver = Base_Page.getDriver();
    }
    
    @Test(priority=1)
    public void testsignin() 
    {
    	logger.info("*** Starting TC01_Sign_in_Page *****");
    	logger.debug("This is a debug log message");
    	try
    	{
        Locators_Class lp = new Locators_Class();
        lp.enterUserName("jaimatadi123@gmail.com");
        logger.info("Enter User Name under text box");
        lp.clickNextbtn();
        logger.info("Click on the Next button");
        lp.enterpassword("Aloha@123");
        logger.info("Enter User Password under box");
        lp.clickSignbtn();
        logger.info("click on the Sign in button");
    }
    
    	catch (Exception e)
    {
        	logger.error("Test failed");
        	logger.debug("Debug Logs..");
        	Assert.fail();
        
    }
    	logger.info("*** End of the logs for Starting TC01_Sign_in_Page *****");
    
    }
    
    @AfterClass
    public void teardown() {
    	Base_Page.quitDriver();
    }
}