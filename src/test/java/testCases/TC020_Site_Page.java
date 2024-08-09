package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Site_Page;

public class TC020_Site_Page {

    @Test(priority = 1)
    public void SitePage() throws InterruptedException {
        Site_Page site = new Site_Page();

        site.clickOnUserID();
        site.clickOnMySite();
        site.clickOnAddSitebtns();
       // site.selectCheckbox(true);
        site.EnterSiteName(generateRandomString().toUpperCase());
        site.OnOkbtnn();
    }
        
        @Test(priority = 2)
        public void Site1() throws InterruptedException {
            Site_Page site1 = new Site_Page();
        // Get the confirmation message
        String confmsg = site1.getConfirmationMsg();
        
        // Add your expected confirmation message here
        String expectedMsg = "Expected confirmation message here";
        
        // Assert to check if the confirmation message matches the expected message
       // Assert.assertEquals(confmsg, expectedMsg, "Confirmation message doesn't match.");
    }

    // Utility method to generate a random string
    private String generateRandomString() {
        // Implement your random string generation logic here
        return "RandomString"; // Placeholder
    }
}
