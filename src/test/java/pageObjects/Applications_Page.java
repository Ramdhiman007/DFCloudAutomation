package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Applications_Page extends Base_Page {
	
	public Applications_Page() {
        super();
        initializeElements(this);
}	
	//Locators
	 @FindBy(xpath="//a[normalize-space()='APPLICATIONS']")
	    WebElement application_page; // Applications page link
	 
	 
	//Actions
	 public void ApplicationPage() {
		 application_page.click(); // Windows Updates page link click karna
}
}
