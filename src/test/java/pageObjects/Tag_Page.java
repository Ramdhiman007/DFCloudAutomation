package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tag_Page extends pageObjects.Base_Page {
    public Tag_Page() {
        super();
        initializeElements(this);

}
    @FindBy(xpath="//span[@title='Tags Management']")
    WebElement clicktagpage; // Tags Management page link
    
    public void tagpage() {
        clicktagpage.click(); // Tags Management page link click karna
    }
}    
