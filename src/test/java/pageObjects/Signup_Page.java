package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Signup_Page extends pageObjects.Base_Page {
    public Signup_Page() {
        super();
        initializeElements(this);
    }
    
    //Locators
    @FindBy(xpath="//input[@id='FirstName']")
    WebElement txt_FirstName; // First Name field

    @FindBy(xpath="//input[@id='LastName']")
    WebElement txt_LastName; // Last Name field

    @FindBy(xpath="//input[@id='Email']")
    WebElement txt_emailid; // Email field

    @FindBy(xpath="//input[@id='Company']")
    WebElement txt_Companyname; // Company Name field

    @FindBy(xpath="//input[@id='Phone']")
    WebElement txt_Phone; // Phone field

    @FindBy(xpath="//select[@id='ddlcountry']")
    WebElement dropdown_country; // Country dropdown
    
    @FindBy(xpath="//input[@id='Captcha']")
    WebElement clickoncaptcha; // Captcha field

    @FindBy(xpath="//img[@id='m_imgCaptcha']")
    WebElement entercaptcha; // Captcha image

    @FindBy(xpath="//label[@for='chkBoxAgreeToContact']")
    WebElement checkcheckbox; // Agree to contact checkbox

    @FindBy(xpath="//label[@for='chkBoxAgreeToProductData']")
    WebElement checkAgree; // Agree to product data checkbox

    @FindBy(xpath="//button[@id='btnSignUp']")
    WebElement clickonsignupbtn; // Sign Up button
    
    
    //Actions
    public void enterFirstName(String UserName) {
        txt_FirstName.sendKeys(UserName); // First Name enter karna
    }

    public void enterLastName(String LastName) {
        txt_LastName.sendKeys(LastName); // Last Name enter karna
    }

    public void enteremailid(String EmailID) {
        txt_emailid.sendKeys(EmailID); // Email ID enter karna
    }

    public void enterCompanyname(String CompanyName) {
        txt_Companyname.sendKeys(CompanyName); // Company Name enter karna
    }

    public void enterphone(String number) {
        txt_Phone.sendKeys(number); // Phone number enter karna
    }

    public void selectCountry(String country) {
        Select drpCountry = new Select(dropdown_country);
        drpCountry.selectByVisibleText(country); // Country dropdown select karna
    }
    
    public void clickCaptcha() {
        clickoncaptcha.click(); // Captcha field click karna
    }

    public void enterCaptcha(String CaptchaText) {
        entercaptcha.sendKeys(CaptchaText); // Captcha enter karna
    }

    public void clickCheckbox() {
        checkcheckbox.click(); // Agree to contact checkbox click karna
    }

    public void checkAgree() {
        checkAgree.click(); // Agree to product data checkbox click karna
    }

    public void clickSignUp() {
        clickonsignupbtn.click(); // Sign Up button click karna
    }

}
