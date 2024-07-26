package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.Locators_Class;
import testBase.Base_Page;

public class TC02_Signup_Page extends Base_Page {
    
    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        driver = Base_Page.getDriver(); // Driver ko initialize karna
    }
    
    @Test(priority=1)
    public void testsignup() {
        Locators_Class sg = new Locators_Class(); // Locators_Class ka instance create karna
        
        // Signup page pe navigate karna
        driver.get("https://www1.faronicsbeta.com/Cloud/en");
        
        // Signup form fill karna
        sg.enterFirstName(randomeString().toUpperCase()); // Random first name enter karna
        sg.enterLastName(randomeString().toUpperCase()); // Random last name enter karna
        sg.enteremailid(randomeString() + "@gmail.com"); // Random email ID generate karna
        sg.enterCompanyname(randomeString().toUpperCase()); // Random company name enter karna
        sg.enterphone(randomeAlphaNumberic()); // Random phone number enter karna
        sg.selectCountry(); // Country select karna
        sg.clickCaptcha(); // Captcha click karna
        sg.enterCaptcha("EnterCaptchaTextHere"); // Actual captcha text yahan daalein
        sg.clickCheckbox(); // Checkbox ko click karna
        sg.checkAgree(); // Agree checkbox ko click karna
        sg.clickSignUp(); // Sign Up button pe click karna
    }
        
    @AfterClass
    public void teardown() {
        Base_Page.quitDriver(); // Driver ko quit karna
    }
}
