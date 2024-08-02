package testCases;

import org.testng.annotations.Test;

import pageObjects.Inventory_Page;

public class TC09_Inventory_Page extends pageObjects.Base_Page {

    @Test(priority=1)
    public void invonterypage() {
    	Inventory_Page lp = new Inventory_Page();
        lp.inventorypage();
        
        
    }

    }