package testCases;

import org.testng.annotations.Test;
import pageObjects.Usage_Stats_Page;

public class TC12_UsageStats_Page extends pageObjects.Base_Page {

	@Test(priority=1)
    public void usagestats() {
		Usage_Stats_Page lp = new Usage_Stats_Page();
        lp.usagestats();
    }

    
}