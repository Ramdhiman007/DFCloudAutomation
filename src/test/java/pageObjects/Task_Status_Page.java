package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task_Status_Page extends pageObjects.Base_Page {
    public Task_Status_Page() {
        super();
        initializeElements(this);
    }
    
    //Locators
    @FindBy(id="dvTaskStatus")
    WebElement clickstaskstatus; // Task Status page link
    
    
    //Actions
    public void taskstatus() {
        clickstaskstatus.click(); // Task Status page link click karna
    }
    
}
