package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.Locators_Class;

public class TC17_TaskStatus_Page extends pageObjects.Base_Page {

	@BeforeClass      
    public void setup() {
        super.setup(toString(), toString()); // Base_Page setup ko call karna
        TC01_Sign_in_Page signInPage = new TC01_Sign_in_Page();
        signInPage.setup(); // Ensure the setup is called for initialization
        signInPage.testsignin(); // Sign in before proceeding
    }

    @Test(priority=1)
    public void taskstatus() {
        Locators_Class lp = new Locators_Class();
        lp.taskstatus();
    }

    @AfterClass
    public void teardown() {
        super.tearDown();
    }
}