package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("http://localhost/opencart/upload/index.php");
//		driver.manage().window().maximize();
//	}
//	@AfterTest
//	public void teardown() {
//		driver.quit();
//		
//	}
	@Test(groups={"Regression","Master"})
	public void verify_account_registration() {
		
		logger.info("***Strating TC001_AccountRegistartionTest");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("click on my account");
		hp.clickRegister();
		logger.info("click on my register");
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("click on my details");

		regpage.setFirstName(randomeString().toLowerCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setTelephone(randomeString());
		regpage.setPassword("xyz12345");
		regpage.setConfirmPassword("xyz12345");
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		logger.info("validating expected message");
		
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		logger.info("** TC001_AccountRegistartionTest");

		
	}
	
	public String randomeString() {
		String generateString=RandomStringUtils.randomAlphabetic(10);
		return  generateString;
		
	}

	
	
}

