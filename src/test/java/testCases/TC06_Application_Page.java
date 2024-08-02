package testCases;

import org.testng.annotations.Test;

import pageObjects.Applications_Page;

public class TC06_Application_Page extends pageObjects.Base_Page {


   
    @Test(priority=1)
    public void applicationpage() {
    	Applications_Page lp = new Applications_Page();
        lp.ApplicationPage();
    }

    }