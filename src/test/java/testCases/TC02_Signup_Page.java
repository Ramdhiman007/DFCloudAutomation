package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Locators_Class;
import testBase.Base_Page;

public class TC02_Signup_Page {
    
    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        driver = Base_Page.getDriver();
    }
    
    @Test(priority=1)
    public void testsignup() {
        Locators_Class sg = new Locators_Class();
        driver.get("https://www1.faronicsbeta.com/Cloud/en");
        sg.enterFirstName("Dhiman");
        sg.enterLastName("Ram");
        sg.enteremailid("ramdhiman89@gmail.com");
        sg.enterCompanyname("JaiMataDi2");
        sg.enterphone("1234567899");
        sg.selectCountry();
        sg.clickCaptcha();
        sg.enterCaptcha("EnterCaptchaTextHere"); // Update this with actual captcha text
        sg.clickCheckbox();
        sg.checkAgree();
        sg.clickSignUp();
    }
    
    @AfterClass
    public void teardown() {
        Base_Page.quitDriver();
    }
}
