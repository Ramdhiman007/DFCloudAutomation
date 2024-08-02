package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsUpdate_Page extends pageObjects.Base_Page{
	public WindowsUpdate_Page() {
        super();
        initializeElements(this);
}       

	//Locators
	@FindBy(xpath="//a[@href='/NU/Dashboard/WindowsUpdates']")
    WebElement ClickOnWU_Page; // Windows Updates page link
	
	
	
	//Actions
	public void WindowsU_Page() {
	ClickOnWU_Page.click();
	
}
}
