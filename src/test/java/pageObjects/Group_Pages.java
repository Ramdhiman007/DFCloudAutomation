package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Group_Pages extends pageObjects.Base_Page {
	public Group_Pages() {
        super();
        initializeElements(this);

}
	//Locators 
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
    @FindBy(xpath="//select[@id='lstPolicyName']")
    WebElement clickon_enforcedpolicy;
    
    
    //Actions
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
    	
   public void selectinpolicy(String inpolicy) 	{
	  
    	Select enforcepolicy = new Select(clickon_enforcedpolicy);
    	enforcepolicy.selectByVisibleText(inpolicy); // Inforced policy select kerna
    }
      public void  clickonaddbtn()
    {
            clickon_addbtn.click();

    }
}
