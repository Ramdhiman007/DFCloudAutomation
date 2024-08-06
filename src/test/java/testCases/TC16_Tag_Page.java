package testCases;

import org.testng.annotations.Test;

import pageObjects.Tag_Page;
public class TC16_Tag_Page extends pageObjects.Base_Page {

	@Test(priority=1)
    public void tagpage() {
		Tag_Page tag = new Tag_Page();
        tag.tagpage();
    }

    
}