package testCases;

import org.testng.annotations.Test;

import pageObjects.Alerts_page;
public class TC18_Alerts_Page extends pageObjects.Base_Page {

	
    @Test(priority=1)
    public void alertpage() {
    	Alerts_page lp = new Alerts_page(); // Locators_Class ka instance create karna
        lp.alertpage(); // Alert page pe navigate karna aur operations perform karna
    }

    
}
