package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.Base_Page;

public class Login_Page extends Base_Page {
    public Login_Page() {
        super();
        initializeElements(this);
    }

    // Locators
    @FindBy(xpath="//input[@id='txtUserName']")
    WebElement txt_Username;

    @FindBy(xpath="//input[@id='btnlogin']")
    WebElement nextbtn_login;

    @FindBy(xpath="//input[@id='txtPassword']")
    WebElement txt_password;

    @FindBy(xpath="//input[@id='btnlogin']")
    WebElement sign_btnlogin;

    @FindBy(xpath="//a[normalize-space()='COMPUTERS']")
    WebElement clickcomputerpage;

    // Action Methods
    public void enterUserName(String User) {
        txt_Username.sendKeys(User);
    }

    public void clickNextbtn() {
        nextbtn_login.click();
    }

    public void enterpassword(String pwd) {
        txt_password.sendKeys(pwd);
    }

    public void clickSignbtn() {
        sign_btnlogin.click();
    }

    public void clickcomputerpage() {
        clickcomputerpage.click();
    }
}
