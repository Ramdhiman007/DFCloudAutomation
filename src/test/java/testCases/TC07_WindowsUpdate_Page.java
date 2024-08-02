package testCases;

import org.testng.annotations.Test;
import pageObjects.WindowsUpdate_Page;

public class TC07_WindowsUpdate_Page extends pageObjects.Base_Page {

	@Test(priority=1)
    public void wupage() {
		WindowsUpdate_Page lp = new WindowsUpdate_Page();
        lp.WindowsU_Page();
	}
}