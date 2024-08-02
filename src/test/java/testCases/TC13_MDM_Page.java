package testCases;

import org.testng.annotations.Test;
import pageObjects.MDM_Page;
public class TC13_MDM_Page extends pageObjects.Base_Page {

	@Test(priority=1)
    public void mdmpage() {
		MDM_Page lp = new MDM_Page();
        lp.mdmpage();
    }

    
}