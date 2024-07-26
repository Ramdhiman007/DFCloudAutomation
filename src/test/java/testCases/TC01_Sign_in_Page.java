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
        driver = Base_Page.getDriver(); // Driver ko initialize karna
    }
    
    @Test(priority=1)
    public void testsignin() {
        logger.info("*** TC01_Sign_in_Page test shuru ho raha hai *****");
        logger.debug("Yeh ek debug log message hai");
        
        try {
            Locators_Class lp = new Locators_Class(); // Locators_Class ka instance create karna
            lp.enterUserName("jaimatadi123@gmail.com"); // Username enter karna
            logger.info("Username text box me enter kiya");
            lp.clickNextbtn(); // Next button pe click karna
            logger.info("Next button pe click kiya");
            lp.enterpassword("Aloha@123"); // Password enter karna
            logger.info("Password text box me enter kiya");
            lp.clickSignbtn(); // Sign-in button pe click karna
            logger.info("Sign-in button pe click kiya");
        } catch (Exception e) {
            logger.error("Test fail ho gaya");
            logger.debug("Debug Logs..");
            Assert.fail(); // Test ko fail karna
        }
        
        logger.info("*** TC01_Sign_in_Page test ke logs khatam *****");
    }
    
    @AfterClass
    public void teardown() {
        Base_Page.quitDriver(); // Driver ko quit karna
    }
}
