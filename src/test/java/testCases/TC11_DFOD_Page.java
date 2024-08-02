package testCases;

import org.testng.annotations.Test;

import pageObjects.DFOD_Page;

public class TC11_DFOD_Page extends pageObjects.Base_Page {	

    @Test(priority=1)
    public void dfodpage() {
    	DFOD_Page lp = new DFOD_Page();
        lp.dfodpage();
        lp.dfodschedule();
        lp.cloudrelay();
    }

    
}