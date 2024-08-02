package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Imaging_Page extends pageObjects.Base_Page {
    public Imaging_Page() {
        super();
        initializeElements(this);
    }

    //Locators
    @FindBy(xpath="//a[@href='/NU/Dashboard/Imaging']")
    WebElement Imaging_Page; // Imaging page link
    
    
    //Actions
    public void ImagingPage() {
      	Imaging_Page.click();
    }
    
}
