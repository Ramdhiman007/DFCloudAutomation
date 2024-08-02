package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Policies_Page extends pageObjects.Base_Page{
	public Policies_Page() {
        super();
        initializeElements(this);

}    //Locators
	@FindBy(xpath="//a[normalize-space()='POLICIES']")
    WebElement clickpoliciespage; // Policies page link
    @FindBy(xpath="//a[@id='aAdd_Policy']")
    WebElement clickaddpbtn;
    @FindBy(xpath="//a[@id='P1']")
    WebElement click_drppolicy;
    @FindBy(xpath="//input[@id='Name']")
    WebElement enterpolicyname;
    @FindBy(xpath="//input[@id='btnSave']")
    WebElement clickonsavebtn;
    
    
    //Actions
    public void clickpoliciespage() {
        clickpoliciespage.click(); // Policies page link click karna
    }
    public void addbtn()
    {
    	clickaddpbtn.click();
    }
    public void clickadbutton()
    {
    	click_drppolicy.click();
    }
    public void enterPolicyName(String policyName) {
        enterpolicyname.sendKeys(policyName);
            
    }    
    public void clicksavebtn()
    {
    	clickonsavebtn.click();
    }
	
	
	
}	
	
