package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Base_Page;
import pageObjects.Signin_Page;

public class TC01_Sign_in_Page extends Base_Page {

   /* @BeforeClass
    public void setup() {
        // Parent class Base_Page ka setup method call karna
        super.setup(toString(), toString());
    }*/

    @Test(priority=1)
    public void testsignin() {
        logger.info("*** TC01_Sign_in_Page test shuru ho raha hai ***");
        logger.debug("Yeh ek debug log message hai");

        try {
            // Locators_Class ka instance create karna
            Signin_Page lp = new Signin_Page();
            lp.enterUserName("jaimatadi123@gmail.com"); // Username enter karna
            logger.info("Username text box me enter kiya");

            lp.clickNextbtn(); // Next button pe click karna
            logger.info("Next button pe click kiya");

            lp.enterpassword("Aloha@123"); // Password enter karna
            logger.info("Password text box me enter kiya");

            lp.clickSignbtn(); // Sign-in button pe click karna
            logger.info("Sign-in button pe click kiya");

            // Assert karke check karna ki sign-in successful hua ya nahi
            // String confmsg = lp.getConfirmationMessage(); // Confirmation message retrieve karna (assuming a method exists)
            // Assert.assertEquals(confmsg, "You Signed in properly");

        } catch (Exception e) {
            logger.error("Test fail ho gaya", e);
            logger.debug("Debug Logs..");
            Assert.fail("Exception aayi: " + e.getMessage()); // Exception message ke sath test ko fail karna
        }

        logger.info("*** TC01_Sign_in_Page test ke logs khatam ***");
    }

   
   
}
