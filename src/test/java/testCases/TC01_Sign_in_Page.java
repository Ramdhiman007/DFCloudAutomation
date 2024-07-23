package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Locators_Class;
import testBase.Base_Page;

public class TC01_Sign_in_Page {
    
    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        driver = Base_Page.getDriver();
    }
    
    @Test(priority=1)
    public void testsignin() {
        Locators_Class lp = new Locators_Class();
        lp.enterUserName("jaimatadi123@gmail.com");
        lp.clickNextbtn();
        lp.enterpassword("Aloha@123");
        lp.clickSignbtn();
    }
    
    @Test(priority=2)
    public void computerpage() {
        Locators_Class lp = new Locators_Class();
        lp.clickcomputerpage();
    }
    
    @AfterClass
    public void teardown() {
        Base_Page.quitDriver();
    }
}
