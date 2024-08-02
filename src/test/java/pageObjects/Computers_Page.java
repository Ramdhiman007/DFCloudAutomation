package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Computers_Page extends Base_Page 
 {
	public Computers_Page() {
        super();
        initializeElements(this);
    }
	
	// Finding Elements of Computers Page
    @FindBy(xpath = "//a[normalize-space()='COMPUTERS']")
    WebElement clickcomputerpage; // Computers page link

    // Actions
    public void clickOnComputerPage() {
        clickcomputerpage.click(); // Computers page link click karna
       
    }
	
	
	
}
