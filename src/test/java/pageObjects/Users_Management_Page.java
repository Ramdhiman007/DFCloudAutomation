package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Users_Management_Page extends pageObjects.Base_Page{
	public Users_Management_Page() {
		super();
		initializeElements(this);

	}
	//Locators
	@FindBy(xpath="//a[@id='logg_main']//span[@class='caret']")
	WebElement ClickonUserID;
	@FindBy(xpath="//a[@id='aLogin_User_Management']")
	WebElement clickOnUsermgm;
	@FindBy(xpath="//button[normalize-space()='Add User']")
	WebElement clickonAdduserBtn;
	@FindBy(xpath="//a[normalize-space()='Add New User']")
	WebElement clickonAddUserbtn;
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement enterFirstName;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement enterLastName;
	@FindBy(xpath="//input[@id='EMailAddress']")
	WebElement enterEMailAddress;
	@FindBy(xpath="//select[@id='Permission']")
	WebElement selectPermission;
	@FindBy(xpath="//input[@id='btnAddCloudUser']")
	WebElement clickonbtnAdd;
	//Adminuser
	@FindBy(xpath = "//button[normalize-space()='Add User']") // Adjust this XPath to match your admin button
    WebElement clickOnAddAdminUserBtn;

	@FindBy(xpath = "//a[normalize-space()='Add New User']") // Adjust this XPath to match your admin user button
	WebElement clickOnAddNewAdminUserBtn;

	@FindBy(xpath = "//input[@id='FirstName']") // Adjust this XPath if needed
	WebElement enterAdminFirstName;

	@FindBy(xpath = "//input[@id='LastName']") // Adjust this XPath if needed
    WebElement enterAdminLastName;

	@FindBy(xpath = "//input[@id='EmailAddress']") // Adjust this XPath if needed
    WebElement enterAdminEmailAddress;

	 @FindBy(xpath = "//select[@id='Permission']") // Adjust this XPath if needed
	 WebElement selectAdminPermission;

	 @FindBy(xpath = "//input[@id='btnAddUser']") // Adjust this XPath if needed
	 WebElement clickOnAddAdminBtn;

	
	// Constructor
	   // public Users_Management_Page(WebDriver driver) {
	      //  super(driver);
//Actions
	public void clickUsr_id() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		ClickonUserID.click();
	}
	public void usermanagement() {
		clickOnUsermgm.click();
		
	}
	public void addCloudUser() {
		clickonAdduserBtn.click();
	}
	public void addNewCloudUser()
	{
		clickonAddUserbtn.click();
	}
	
	public void putfirstname1(String firstname)
	{
	   enterFirstName.sendKeys(firstname);
	}
	public void putlastname(String lastname)
	{
	   enterLastName.sendKeys(lastname);
	}

	public void putemail(String email)
	{
	     enterEMailAddress.sendKeys(email);
	}
	public void selectSAuser(String superAdmin)
	    {
	    	Select drpsuper = new Select(selectPermission);
	    	drpsuper.selectByVisibleText(superAdmin); // Super Admin user select kerna
	    } 

	public void clickonaddbtn()
{
		
	     clickonbtnAdd.click();
	}

	//Admin User
	

	public void addAdminUser() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        clickOnAddAdminUserBtn.click();
    }

    public void addNewAdminUser() {
        clickOnAddNewAdminUserBtn.click();
    }

    public void AdminFirstname(String firstname) {
        enterAdminFirstName.sendKeys(firstname);
    }

    public void AdminLastname(String lastname) {
        enterAdminLastName.sendKeys(lastname);
    }

    public void AdminEmail(String email) {
        enterAdminEmailAddress.sendKeys(email);
    }

    public void AdminPermission(String permission) {
        Select dropdown = new Select(selectAdminPermission);
        dropdown.selectByVisibleText(permission);
    }

    public void clickOnAddAdminBtn() {
        clickOnAddAdminBtn.click();
    }
	
}



