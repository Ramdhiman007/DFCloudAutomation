package testCases;

import org.testng.annotations.Test;

import pageObjects.Tickets_Page;
public class TC10_Tickets_Page extends pageObjects.Base_Page {
	
    @Test(priority=1)
    public void ticketspage() {
    	Tickets_Page lp = new Tickets_Page();
        lp.ticketspage();
    }

    }