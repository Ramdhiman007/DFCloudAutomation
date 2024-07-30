package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Locators_Class extends Base_Page {
    public Locators_Class() {
        super();
        initializeElements(this);
    }

    // Locators
    @FindBy(xpath="//input[@id='txtUserName']")
    WebElement txt_Username; // Username field

    @FindBy(xpath="//input[@id='btnlogin']")
    WebElement nextbtn_login; // Login button

    @FindBy(xpath="//input[@id='txtPassword']")
    WebElement txt_password; // Password field

    @FindBy(xpath="//input[@id='btnlogin']")
    WebElement sign_btnlogin; // Sign in button

    @FindBy(xpath="//a[normalize-space()='COMPUTERS']")
    WebElement clickcomputerpage; // Computers page link

    
    
    @FindBy(xpath="//a[@href='/en/Group/List'][normalize-space()='GROUPS']")
    WebElement clickgrouppage; // Groups page link
    @FindBy(xpath="//span[@class='imgTextHome']")
    WebElement click_addbtn;
    @FindBy(xpath="//input[@id='Name']")
    WebElement txt_gpname; // Groups page link
    @FindBy(xpath="//select[@id='lstGroupName']")
    WebElement click_ptdbtn;
    @FindBy(xpath="//button[@id='btnAddGroup']")
    WebElement clickon_addbtn;

    
    
    
    

    @FindBy(xpath="//a[normalize-space()='POLICIES']")
    WebElement clickpoliciespage; // Policies page link

    @FindBy(xpath="//a[normalize-space()='APPLICATIONS']")
    WebElement applicationpage; // Applications page link

    @FindBy(xpath="//a[@href='/NU/Dashboard/WindowsUpdates']")
    WebElement clickwupage; // Windows Updates page link

    @FindBy(xpath="//a[@href='/NU/Dashboard/Imaging']")
    WebElement clickimagingpage; // Imaging page link

    @FindBy(xpath="//a[@href='/NU/Dashboard/Inventory']")
    WebElement clickinventorypage; // Inventory page link

    @FindBy(xpath="//a[@href='/NU/Dashboard/Tickets']")
    WebElement clickticketspage; // Tickets page link

    @FindBy(xpath="//a[normalize-space()='DEEP FREEZE ON DEMAND']")
    WebElement clickdfodpage; // Deep Freeze on Demand page link

    @FindBy(xpath="//a[normalize-space()='MANAGE SCHEDULES']")
    WebElement clickschedule; // Manage Schedules page link

    @FindBy(xpath="//a[normalize-space()='CLOUD RELAYS']")
    WebElement clickrelay; // Cloud Relays page link

    @FindBy(xpath="//a[@href='/en/UsageStats/Dashboard']")
    WebElement clicksuspage; // Usage Stats page link

    @FindBy(xpath="//a[normalize-space()='MDM']")
    WebElement clicksmdmpage; // MDM page link

    @FindBy(xpath="//span[@title='Tags Management']")
    WebElement clicktagpage; // Tags Management page link

    @FindBy(xpath="//span[@title='Task Status']")
    WebElement clickstaskstatus; // Task Status page link

    @FindBy(xpath="//div[@id='dvNotificationCount']")
    WebElement clickalertpage; // Alerts page link

    // Signup Locators
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

    public void clickcomputerpage() {
        clickcomputerpage.click(); // Computers page link click karna
    }

      
    public void clickgrouppage() {
        clickgrouppage.click(); // Groups page link click karna
    }
    
    public void clickAddbtn()
    {
    	click_addbtn.click();
    }
    public void entergpname(String groupname) 
    {
          txt_gpname.sendKeys(groupname); // Groups name Enter karna
    }

    public void selectptgroup(String ptgroup)
    {
    	Select drpPTGroup = new Select(click_ptdbtn);
    	drpPTGroup.selectByVisibleText(ptgroup); // PT group select kerna
    
    }
      public void  clickonaddbtn()
    {
            clickon_addbtn.click();

    }
      

    public void clickpoliciespage() {
        clickpoliciespage.click(); // Policies page link click karna
    }

    public void applicationpage() {
        applicationpage.click(); // Applications page link click karna
    }

    public void windowsupdate() {
        clickwupage.click(); // Windows Updates page link click karna
    }

    public void imagingpage() {
        clickimagingpage.click(); // Imaging page link click karna
    }

    public void inventorypage() {
        clickinventorypage.click(); // Inventory page link click karna
    }

    public void ticketspage() {
        clickticketspage.click(); // Tickets page link click karna
    }

    public void dfodpage() {
        clickdfodpage.click(); // Deep Freeze on Demand page link click karna
    }

    public void dfodschedule() {
        clickschedule.click(); // Manage Schedules page link click karna
    }

    public void cloudrelay() {
        clickrelay.click(); // Cloud Relays page link click karna
    }

    public void usagestats() {
        clicksuspage.click(); // Usage Stats page link click karna
    }

    public void mdmpage() {
        clicksmdmpage.click(); // MDM page link click karna
    }

    public void tagpage() {
        clicktagpage.click(); // Tags Management page link click karna
    }

    public void taskstatus() {
        clickstaskstatus.click(); // Task Status page link click karna
    }

    public void alertpage() {
        clickalertpage.click(); // Alerts page link click karna
    }

    // Signup Action Methods
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
