package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import junit.framework.Assert;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {
	public static WebDriver driver;
	public Logger logger;
	public Properties p;
	@BeforeClass(groups={"Sanity","Regression","Master"})
	public void setup() throws IOException {
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		logger=LogManager.getLogger(this.getClass());

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("AppURL1"));  //reading from prop file
		driver.manage().window().maximize();
	}
	@AfterClass(groups={"Sanity","Regression","Master"})
	public void teardown() {
		driver.quit();
		
	}
//	@Test
//	public void verify_account_registration() {
//		HomePage hp=new HomePage(driver);
//		hp.clickMyAccount();
//		hp.clickRegister();
//		
//		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
//		regpage.setFirstName(randomeString().toLowerCase());
//		regpage.setLastName(randomeString().toUpperCase());
//		regpage.setEmail(randomeString()+"@gmail.com");
//		regpage.setTelephone(randomeString());
//		regpage.setPassword("xyz12345");
//		regpage.setConfirmPassword("xyz12345");
//		regpage.setPrivacyPolicy();
//		regpage.clickContinue();
//		String confmsg=regpage.getConfirmationMsg();
//		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
//	}
//      
//	public String randomeString() {
//		String generateString=RandomStringUtils.randomAlphabetic(10);
//		return  generateString;
//		
//	}
	public String captureScreen(String tname) {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;
		
		
	}
}



