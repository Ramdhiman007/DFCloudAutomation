package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Locators_Class;
import testBase.Base_Page;

public class TC18_Alerts_Page extends Base_Page {

    @BeforeClass      
    public void setup() {
        super.setup(); // Base_Page setup ko call karna
        TC01_Sign_in_Page signInPage = new TC01_Sign_in_Page(); // TC01_Sign_in_Page ka instance banana
        signInPage.setup(); // Setup method ko call karna initialization ke liye
        signInPage.testsignin(); // Test se pehle sign in karna
    }

    @Test(priority=1)
    public void alertpage() {
        Locators_Class lp = new Locators_Class(); // Locators_Class ka instance create karna
        lp.alertpage(); // Alert page pe navigate karna aur operations perform karna
    }

    @AfterClass
    public void teardown() {
        super.tearDown(); // Base_Page teardown ko call karna
    }
}
