package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin_Page extends pageObjects.Base_Page {
    public Signin_Page() {
        super();
        initializeElements(this);
    }

    // Locators
    //Finding Locators Elements of SignIn Page
    @FindBy(xpath="//input[@id='txtUserName']")
    WebElement txt_Username; // Username field

    @FindBy(xpath="//input[@id='btnlogin']")
    WebElement nextbtn_login; // Login button

    @FindBy(xpath="//input[@id='txtPassword']")
    WebElement txt_password; // Password field

    @FindBy(xpath="//input[@id='btnlogin']")
    WebElement sign_btnlogin; // Sign in button


    // Action Methods
    public void enterUserName(String User) {
        txt_Username.sendKeys(User); // Username enter karna
    }

    public void clickNextbtn() {
        nextbtn_login.click(); // Next button click karna
    }

    public void enterpassword(String pwd) {
        txt_password.sendKeys(pwd); // Password enter karna
    }

    public void clickSignbtn() {
        sign_btnlogin.click(); // Sign In button click karna
    }

}
