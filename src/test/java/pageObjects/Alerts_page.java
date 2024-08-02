package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alerts_page extends pageObjects.Base_Page {
    public Alerts_page() {
        super();
        initializeElements(this);
    }
    
    //Locators
    @FindBy(xpath="//div[@id='dvNotificationCount']")
    WebElement clickalertpage; // Alerts page link
    
    
    //Actions
    public void alertpage() {
        clickalertpage.click(); // Alerts page link click karna
    }
    
}


