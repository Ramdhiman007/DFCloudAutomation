package pageObjects;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Page {
    public static WebDriver driver; // WebDriver instance
    public Logger logger; // Logger instance
    public WebDriverWait wait; // WebDriverWait instance
    @BeforeClass
    @Parameters({"os", "browser"})
    public void setup(@Optional("Windows") String os, @Optional("chrome") String br) {
        logger = LogManager.getLogger(this.getClass()); // Logger initialize karna
        
        switch (br.toLowerCase()) {
            case "edge":
                WebDriverManager.edgedriver().setup(); // EdgeDriver setup karna
                driver = new EdgeDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup(); // ChromeDriver setup karna
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup(); // FirefoxDriver setup karna
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("This is an invalid browser name...");
                return;
        }

        if (driver != null) {
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicit wait set karna
            wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Initialize WebDriverWait
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
    
    // Randomly generated string return karna (alphabetic) This is for Signup Page
    public String randomeString() {
        return RandomStringUtils.randomAlphabetic(10); // Random alphabetic string generate karna
    }
    
    // Randomly generated number return karna
    public String randomNumber() {
        return RandomStringUtils.randomNumeric(10); // Random numeric string generate karna
    }
    
    // Randomly generated alphanumeric string with special character
    public String randomeAlphaNumberic() {
        String generatedstring = RandomStringUtils.randomAlphabetic(10); // Random alphabetic string generate karna
        String generatednumber = RandomStringUtils.randomNumeric(10); // Random numeric string generate karna
        return generatedstring + "@" + generatednumber; // Combine karke return karna
    }

    // Page elements ko initialize karna
    public void initializeElements(Object page) {
        PageFactory.initElements(driver, page); // PageFactory ka use karke page elements initialize karna
    }
}
