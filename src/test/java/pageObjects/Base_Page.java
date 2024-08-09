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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Page {
    public static WebDriver driver; // WebDriver instance
    public Logger logger; // Logger instance
    public WebDriverWait wait; // WebDriverWait instance

    @BeforeTest
    @Parameters({"os", "browser"})
    public void setup(@Optional("Windows") String os, @Optional("chrome") String br) {
        logger = LogManager.getLogger(this.getClass()); // Logger initialization

        // Setup WebDriver based on browser parameter
        switch (br.toLowerCase()) {
            case "edge":
                WebDriverManager.edgedriver().setup(); // EdgeDriver setup
                driver = new EdgeDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup(); // ChromeDriver setup
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup(); // FirefoxDriver setup
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("This is an invalid browser name...");
                return;
        }

        if (driver != null) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Implicit wait
            wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Initialize WebDriverWait
            driver.get("https://www1.faronicsbeta.com/en/Account/Login"); // Open URL
            driver.manage().window().maximize(); // Maximize window
        }
    }

    @AfterTest
    public void tearDown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
            driver = null; // Set driver to null
        }
    } 

    public static WebDriver getDriver() {
        return driver;
    }

    // Randomly generated string (alphabetic)
    public String randomeString() {
        return RandomStringUtils.randomAlphabetic(10); // Generate random alphabetic string
    }

    // Randomly generated number
    public String randomNumber() {
        return RandomStringUtils.randomNumeric(10); // Generate random numeric string
    }

    // Randomly generated alphanumeric string with special character
    public String randomeAlphaNumberic() {
        String generatedstring = RandomStringUtils.randomAlphabetic(5); // Generate random alphabetic string
        String generatednumber = RandomStringUtils.randomNumeric(5); // Generate random numeric string
        return generatedstring + "@" + generatednumber; // Combine and return
    }

    // Initialize page elements
    public void initializeElements(Object page) {
        PageFactory.initElements(driver, page); // Initialize page elements using PageFactory
    }
}
