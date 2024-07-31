package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Locators_Class;

public class TC05_Policies_Page extends pageObjects.Base_Page {

    
    @BeforeClass      
    public void setup() {
        super.setup(toString(), toString()); // Base_Page setup ko call karna
        TC01_Sign_in_Page signInPage = new TC01_Sign_in_Page();
        signInPage.setup(); // Ensure the setup is called for initialization
        signInPage.testsignin(); // Sign in before proceeding
    }

    @Test(priority=1)
    public void policypage() {
        Locators_Class lp = new Locators_Class();
        lp.clickpoliciespage();
        lp.addbtn();
        lp.clickadbutton();
    }
    
   @Test(priority=2)  // Add New Policy
    public void policypage1()
    {
    	Locators_Class wp=new Locators_Class();
    	
    	wp.addbtn();
        wp.clickadbutton();
        wp.enterpolicyname("55dhiman");
        wp.clicksavebtn();
        
    } 

    @AfterClass
    public void teardown() {
        super.tearDown(); // Base_Page tearDown ko call karna

    }
}