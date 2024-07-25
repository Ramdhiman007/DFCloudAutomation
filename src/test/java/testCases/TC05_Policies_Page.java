package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Locators_Class;
import testBase.Base_Page;

public class TC05_Policies_Page extends Base_Page {

    WebDriver driver;

    @BeforeClass
    public void signInPage() {
        driver = Base_Page.getDriver();
        TC01_Sign_in_Page signInPage = new TC01_Sign_in_Page();
        signInPage.setup(); // Ensure the setup is called for initialization
        signInPage.testsignin(); // Sign in before proceeding
    }

    @Test(priority=1)
    public void grouppage() {
        Locators_Class lp = new Locators_Class();
        lp.clickpoliciespage();
    }

    @AfterClass
    public void teardown() {
        Base_Page.quitDriver();
    }
}