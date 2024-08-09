package pageObjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Site_Page extends Base_Page {

    public Site_Page() {
        super();
        initializeElements(this);
    }


    // Ye hain locators
    @FindBy(xpath="//a[@id='logg_main']//span[@class='caret']")
    WebElement clickEmail;
    @FindBy(xpath="//a[@id='aLogin_MySite']")
    WebElement clickOnSitepage;
    @FindBy(xpath="//span[@class='imgTextHome1']")
    WebElement clickOnAddSitebtn;
    @FindBy(xpath="//input[@id='SiteName']")
    WebElement enterSiteName;
    @FindBy(xpath="//input[@id='btn_OK']")
    WebElement clickOnOkbuttonn;
    @FindBy(xpath="//span[@id='SpanServiceMsgbox']")
    WebElement msgConfirmation;

    // Ye hain actions
    public void clickOnUserID() {
           clickEmail.click();
    }

    public void clickOnMySite() {
    	clickOnSitepage.click();
    }

    public void clickOnAddSitebtns() throws InterruptedException {
    	Thread.sleep(5000);
    	clickOnAddSitebtn.click();
    }

    /* public void selectCheckbox(boolean shouldCheck) {
       
        boolean isChecked = checkboxcheck.isSelected();
        if (shouldCheck && !isChecked) {
            checkboxcheck.click(); // Check the checkbox if it's not already checked
        } else if (!shouldCheck && isChecked) {
            checkboxcheck.click(); // Uncheck the checkbox if it's already checked
        }
    } */

    public void EnterSiteName(String siteName) throws InterruptedException {
    	Thread.sleep(9000);
        enterSiteName.sendKeys(siteName);
    }

    public void OnOkbtnn() {
    	
    	clickOnOkbuttonn.click();
    }

    public String getConfirmationMsg() {
        try {
            if (msgConfirmation.isDisplayed()) {
                return msgConfirmation.getText();
            } else {
                return "Message confirmation element dikhai nahi de raha hai.";
            }
        } catch (NoSuchElementException e) {
            return "Message confirmation element nahi mila.";
        } catch (Exception e) {
            return "Koi error aayi hai: " + e.getMessage();
        }
    }
}

