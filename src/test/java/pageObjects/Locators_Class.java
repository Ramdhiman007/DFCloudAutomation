package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.Base_Page;

public class Locators_Class extends Base_Page {
    public Locators_Class() {
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
    @FindBy(xpath="//a[@href='/en/Group/List'][normalize-space()='GROUPS']")
    WebElement clickgrouppage;
    @FindBy(xpath="//a[normalize-space()='POLICIES']")
    WebElement clickpoliciespage;
    @FindBy(xpath="//a[normalize-space()='APPLICATIONS']")
    WebElement applicationpage;
    @FindBy(xpath="//a[@href='/NU/Dashboard/WindowsUpdates']")
    WebElement clickwupage;
    @FindBy(xpath="//a[@href='/NU/Dashboard/Imaging']")
    WebElement clickimagingpage;
    @FindBy(xpath="//a[@href='/NU/Dashboard/Inventory']")
    WebElement clickinventorypage;
    @FindBy(xpath="//a[@href='/NU/Dashboard/Tickets']")
    WebElement clickticketspage;
    @FindBy(xpath="//a[normalize-space()='DEEP FREEZE ON DEMAND']")
    WebElement clickdfodpage;
    @FindBy(xpath="//a[normalize-space()='MANAGE SCHEDULES']")
    WebElement clickschedule;
    @FindBy(xpath="//a[normalize-space()='CLOUD RELAYS']")
    WebElement clickrelay;
    @FindBy(xpath="//a[@href='/en/UsageStats/Dashboard']")
    WebElement clicksuspage;
    @FindBy(xpath="//a[normalize-space()='MDM']")
    WebElement clicksmdmpage;
    @FindBy(xpath="//span[@title='Tags Management']")
    WebElement clicktagpage;
    @FindBy(xpath="//span[@title='Task Status']")
    WebElement clickstaskstatus;
    @FindBy(xpath="//div[@id='dvNotificationCount']")
    WebElement clickalertpage;


    // Locators SignUp pages
    @FindBy(xpath="//input[@id='FirstName']")
    WebElement txt_FirstName;

    @FindBy(xpath="//input[@id='LastName']")
    WebElement txt_LastName;

    @FindBy(xpath="//input[@id='Email']")
    WebElement txt_emailid;

    @FindBy(xpath="//input[@id='Company']")
    WebElement txt_Companyname;

    @FindBy(xpath="//input[@id='Phone']")
    WebElement txt_Phone;

    @FindBy(xpath="//select[@id='ddlcountry']")
    WebElement selectcountry;

    @FindBy(xpath="//input[@id='Captcha']")
    WebElement clickoncaptcha;

    @FindBy(xpath="//img[@id='m_imgCaptcha']")
    WebElement entercaptcha;

    @FindBy(xpath="//label[@for='chkBoxAgreeToContact']")
    WebElement checkcheckbox;

    @FindBy(xpath="//label[@for='chkBoxAgreeToProductData']")
    WebElement checkAgree;

    @FindBy(xpath="//button[@id='btnSignUp']")
    WebElement clickonsignupbtn;

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
    
    public void clickgrouppage()
    {
    	clickgrouppage.click();
    }
    public void clickpoliciespage()
    {
    	clickpoliciespage.click();
    }
    public void applicationpage()
    {
    	applicationpage.click();
    }
    public void windowsupdate()
    {
    	clickwupage.click();
    }
    public void imagingpage()
    {
    	clickimagingpage.click();
    }
    public void invonterypage()
    {
    	clickinventorypage.click();
    }
    public void ticketspage()
    {
    	clickticketspage.click();
    }
    public void dfodpage()
    {
    	clickdfodpage.click();
    }
    public void dfodschedule()
    {
    	clickschedule.click();
    }
    public void cloudrelay()
    {
    	clickrelay.click();
    }
    public void usagestats()
    {
    	clicksuspage.click();
    }
    public void mdmpage()
    {
    	clicksmdmpage.click();
    }
    public void tagpage()
    {
    	clicktagpage.click();
    }
    public void taskstatus()
    {
    	clickstaskstatus.click();
    }
    public void alertpage()
    {
    	clickalertpage.click();
    }

    // Signup Action Methods
    public void enterFirstName(String UserName) {
        txt_FirstName.sendKeys(UserName);
    }

    public void enterLastName(String LastName) {
        txt_LastName.sendKeys(LastName);
    }

    public void enteremailid(String EmailID) {
        txt_emailid.sendKeys(EmailID);
    }

    public void enterCompanyname(String CompanyName) {
        txt_Companyname.sendKeys(CompanyName);
    }

    public void enterphone(String number) {
        txt_Phone.sendKeys(number);
    }

    public void selectCountry() {
        selectcountry.click();
    }

    public void clickCaptcha() {
        clickoncaptcha.click();
    }

    public void enterCaptcha(String CaptchaText) {
        entercaptcha.sendKeys(CaptchaText);
    }

    public void clickCheckbox() {
        checkcheckbox.click();
    }

    public void checkAgree() {
        checkAgree.click();
    }

    public void clickSignUp() {
        clickonsignupbtn.click();
    }
}