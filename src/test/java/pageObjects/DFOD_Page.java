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

   
}
