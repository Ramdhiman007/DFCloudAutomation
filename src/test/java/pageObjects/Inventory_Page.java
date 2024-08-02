package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Inventory_Page extends pageObjects.Base_Page {
    public Inventory_Page() {
        super();
        initializeElements(this);

}
    //Locators
    @FindBy(xpath="//a[@href='/NU/Dashboard/Inventory']")
    WebElement clickinventorypage; // Inventory page link
    
    //Actions
    public void inventorypage() {
    	clickinventorypage.click();
    }
}