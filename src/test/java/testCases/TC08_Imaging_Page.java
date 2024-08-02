package testCases;

import org.testng.annotations.Test;

import pageObjects.Imaging_Page;

public class TC08_Imaging_Page extends pageObjects.Base_Page {

    @Test(priority=1)
    public void ImagingPage() {
    	Imaging_Page lp = new Imaging_Page();
        lp.ImagingPage();
    }

}