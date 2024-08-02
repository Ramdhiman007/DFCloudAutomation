package testCases;

import org.testng.annotations.Test;

import pageObjects.Group_Pages;

public class TC04_Groups_Page extends pageObjects.Base_Page {
    

    @Test(priority=1)
    public void grouppage() {
    	Group_Pages gp = new Group_Pages();
        gp.clickgrouppage();
        gp.clickAddbtn();
        gp.entergpname(randomeString().toUpperCase()); // Random first name enter karna
        gp.selectptgroup("Default");
        gp.selectinpolicy("Faronics Default");
        gp.clickonaddbtn();
     // Wait for the group to be added and displayed
     
        
        
        
    	
    }

    
}