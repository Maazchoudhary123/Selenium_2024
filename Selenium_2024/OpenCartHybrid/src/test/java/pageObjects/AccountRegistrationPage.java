package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {


    public AccountRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement txtFirstname;
    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement txtLastname;
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txtEmail;
    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement txtTelephone;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txtPassword;
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement txtConfirmPassword;
    @FindBy(xpath = "//input[@name='agree']")
    WebElement chkdPolicy;
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement btnContinue;
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement msgConfirmation;

    public void setFirstName(String fname) {
        txtFirstname.sendKeys(fname);
    }
    public void setLastName(String lname) {
        txtLastname.sendKeys(lname);
    }

    public void setEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void setTelephone(String tel) {
        txtTelephone.sendKeys(tel);
    }
    public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }

    public void setConfirmPassword(String pwd) {
        txtConfirmPassword.sendKeys(pwd);
    }

    public void setPrivacyPolicy() {
        chkdPolicy.click();
    }

    public void clickContinue() {
        btnContinue.click();
     // Solution 2: Submit form
        // btnContinue.submit();
        
        // Solution 3: Using Actions class
        // Actions act = new Actions(driver);
        // act.moveToElement(btnContinue).click().perform();
        
        // Solution 4: Using JavaScriptExecutor
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].click();", btnContinue);
        
        // Solution 5: Simulate pressing the Enter key
        // btnContinue.sendKeys(Keys.RETURN);
        
        // Solution 6: Using WebDriverWait for element to be clickable
        // WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
    }
    public String getConfirmationMsg() {
        try {
            return msgConfirmation.getText();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
}


