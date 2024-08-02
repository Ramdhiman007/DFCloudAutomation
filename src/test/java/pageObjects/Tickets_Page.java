package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tickets_Page extends pageObjects.Base_Page {
    public Tickets_Page() {
        super();
        initializeElements(this);

}
    
    //Locators
    @FindBy(xpath="//a[@href='/NU/Dashboard/Tickets']")
    WebElement clickticketspage; // Tickets page link
    
    //Actions
    public void ticketspage() {
        clickticketspage.click(); // Tickets page link click karna
    
}
}