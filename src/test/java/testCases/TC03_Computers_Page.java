package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.Computers_Page;

public class TC03_Computers_Page extends pageObjects.Base_Page {

     

    @Test(priority = 1)
    public void computerPageTest() {
    	
    	Computers_Page cp = new Computers_Page();
        cp.clickOnComputerPage(); // Computers page pe click karna
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
    }
}