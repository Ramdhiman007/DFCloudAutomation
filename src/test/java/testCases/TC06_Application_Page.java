package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Locators_Class;
import testBase.Base_Page;

public class TC06_Application_Page extends Base_Page {

    WebDriver driver;

    @BeforeClass      
    public void setup() {
        super.setup(); // Base_Page setup ko call karna
        TC01_Sign_in_Page signInPage = new TC01_Sign_in_Page();
        signInPage.setup(); // Ensure the setup is called for initialization
        signInPage.testsignin(); // Sign in before proceeding
    }

    @Test(priority=1)
    public void applicationpage() {
        Locators_Class lp = new Locators_Class();
        lp.applicationpage();
    }

    @AfterClass
    public void teardown() {
        super.tearDown();
    }
}