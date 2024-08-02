package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void dfodschedule() {
        clickschedule.click(); // Manage Schedules page link click karna
    }

    public void cloudrelay() {
        clickrelay.click(); // Cloud Relays page link click karna
    }

}
