package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Login_Page;
import testBase.Base_Page;

public class TC01_Sign_in_Page {
    
    WebDriver driver;
    
    @BeforeTest
    public void setup() {
        driver = Base_Page.getDriver();
    }
    
    @Test(priority=1)
    public void testsignin() {
        Login_Page lp = new Login_Page();
        lp.enterUserName("jaimatadi123@gmail.com");
        lp.clickNextbtn();
        lp.enterpassword("Aloha@123");
        lp.clickSignbtn();
    }
    
    @Test(priority=2)
    public void computerpage() {
        Login_Page lp = new Login_Page();
        lp.clickcomputerpage();
    }
    
    @AfterTest
    public void teardown() {
        Base_Page.quitDriver();
    }
}
