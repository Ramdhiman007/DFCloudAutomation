package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DFOD_Page extends pageObjects.Base_Page {
    public DFOD_Page() {
        super();
        initializeElements(this);
    }
    @FindBy(xpath="//a[normalize-space()='DEEP FREEZE ON DEMAND']")
    WebElement clickdfodpage; // Deep Freeze on Demand page link

   @FindBy(xpath="//a[normalize-space()='MANAGE SCHEDULES']")
    WebElement clickschedule; // Manage Schedules page link

    @FindBy(xpath="//a[normalize-space()='CLOUD RELAYS']")
    WebElement clickrelay; // Cloud Relays page link
    
    //Actions
    public void dfodpage() {
       
    	clickdfodpage.click(); // Deep Freeze on Demand page link click karna
    }

    public void dfodschedule(String clickschedule1)
    {
    	Select dfodschedule = new Select(clickschedule);
    	dfodschedule .selectByVisibleText(clickschedule1); 
    }

    public void dfodsRelay(String clicksRelay)
    {
    	Select dfodschedule = new Select(clickschedule);
    	dfodschedule .selectByVisibleText(clicksRelay); 

}  
}
