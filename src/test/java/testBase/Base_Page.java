package testBase;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {
    protected static WebDriver driver; // WebDriver instance
    protected static Logger logger; // Logger instance

    public Base_Page() {
        // Empty constructor
        logger = LogManager.getLogger(this.getClass()); // Logger initialize karna
    }

    // WebDriver ko initialize karna aur return karna
    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver(); // ChromeDriver instance create karna
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait set karna
            driver.get("https://www1.faronicsbeta.com/en/Account/Login"); // URL open karna
            driver.manage().window().maximize(); // Window ko maximize karna
        }
        return driver; // WebDriver instance return karna
    }

    // WebDriver ko quit karna
    public static void quitDriver() {
        if (driver != null) {
            driver.quit(); // WebDriver ko quit karna
            driver = null; // Driver ko null set karna
        }
    }
  
    // Randomly generated string return karna (alphabetic)
    public String randomeString() {
        String generatedstring = RandomStringUtils.randomAlphabetic(10); // Random alphabetic string generate karna
        return generatedstring; // Generated string return karna
    }
    
    // Randomly generated number return karna
    public String randomNumber() {
        String generatednumber = RandomStringUtils.randomNumeric(10); // Random numeric string generate karna
        return generatednumber; // Generated number return karna
    }
    
    // Randomly generated alphanumeric string with special character
    public String randomeAlphaNumberic() {
        String generatedstring = RandomStringUtils.randomAlphabetic(10); // Random alphabetic string generate karna
        String generatednumber = RandomStringUtils.randomNumeric(10); // Random numeric string generate karna
        return (generatedstring + "@" + generatednumber); // Combine karke return karna
    }

    // Page elements ko initialize karna
    public void initializeElements(Object page) {
        PageFactory.initElements(driver, page); // PageFactory ka use karke page elements initialize karna
    }
}
