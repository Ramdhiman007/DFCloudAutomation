package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Usage_Stats_Page extends pageObjects.Base_Page {
    public Usage_Stats_Page() {
        super();
        initializeElements(this);
    }

    //Locators
    @FindBy(xpath="//a[@href='/en/UsageStats/Dashboard']")
    WebElement clicksuspage; // Usage Stats page link
    
    //Actions
    public void usagestats() {
        clicksuspage.click(); // Usage Stats page link click karna
    }
    
}
