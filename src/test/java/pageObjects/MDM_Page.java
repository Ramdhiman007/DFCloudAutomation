package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MDM_Page extends pageObjects.Base_Page {
    public MDM_Page() {
        super();
        initializeElements(this);
    }
    //Locators
    @FindBy(xpath="//a[normalize-space()='MDM']")
    WebElement clicksmdmpage; // MDM page link
    
    

    
    //Actions
    public void mdmpage() {
        clicksmdmpage.click(); // MDM page link click karna
    }
    

}
