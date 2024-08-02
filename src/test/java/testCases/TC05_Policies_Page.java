package testCases;

import org.testng.annotations.Test;

import pageObjects.Policies_Page;

public class TC05_Policies_Page extends pageObjects.Base_Page {

       
    @Test(priority=1)
    public void PolicyPage() {
    	Policies_Page lp = new Policies_Page();
        lp.clickpoliciespage();
        
    }
    
   @Test(priority=2)  // Add New Policy
    public void policypage1()
    {
	   Policies_Page wp=new Policies_Page();
	   wp.addbtn();
	   wp.clickadbutton();
       wp.enterPolicyName(randomeString().toUpperCase());
	   wp.clicksavebtn();
        
    } 

    
}