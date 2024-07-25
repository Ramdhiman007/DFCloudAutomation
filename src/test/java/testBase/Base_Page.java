package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {
    protected static WebDriver driver;
    protected static Logger logger;
    
    public Base_Page() {
        // Empty constructor
    	logger=LogManager.getLogger(this.getClass());
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www1.faronicsbeta.com/en/Account/Login");
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
  //yaha per randomly generated hogi email jo ki es code ka use kerege hum Name, Last Name and org or 
    //email ke ander 
    public String randomeString()
    {
    	String generatedstring=RandomStringUtils.randomAlphabetic(10);
    	return generatedstring;
    }
    
    // or agar number randomly generated kerwana hai to ye code ka use kare ge hum
    
    public String randomNumber()
    {
    	String genneratednumber=RandomStringUtils.randomNumeric(10);
    	return genneratednumber;
    }
    
    //ye code main hum spacial characters de sakte hai 
    public String randomeAlphaNumberic()
    {
    	String generatedstring=RandomStringUtils.randomAlphabetic(10);
    	String genneratednumber=RandomStringUtils.randomNumeric(10);
    	return(generatedstring+"@"+genneratednumber);
    }

    public void initializeElements(Object page) {
        PageFactory.initElements(driver, page);
    }
}