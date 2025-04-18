package PageObjectTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTest {
	WebDriver driver;
	
	
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	
	@Test
	void testLogin() {
		LoginPage2 lp=new LoginPage2(driver);
		lp.setUserName("Admin");
		lp.setPssword("admin123");
		lp.clickBtn();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
	@AfterClass
	void tearDown() {
		driver.quit();
		
	}

}
