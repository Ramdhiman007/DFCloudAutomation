package testBase;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Page {
    private static WebDriver driver; // WebDriver instance
    public Logger logger; // Logger instance
    
    @BeforeClass
    public void setup() {
        // Empty constructor
        logger = LogManager.getLogger(this.getClass()); // Logger initialize karna

        // WebDriver ko initialize karna aur return karna
        if (driver == null) {
            driver = new ChromeDriver(); // ChromeDriver instance create karna
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait set karna
            driver.get("https://www1.faronicsbeta.com/en/Account/Login"); // URL open karna
            driver.manage().window().maximize(); // Window ko maximize karna
        }
    }
    
    @AfterClass
    public void tearDown() {
        // WebDriver ko quit karna
        if (driver != null) {
            driver.quit();
            driver = null; // Driver ko null set karna
        }
    }
    
    public static WebDriver getDriver() {
        return driver;
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
