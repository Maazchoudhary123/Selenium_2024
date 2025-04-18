package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		logger.info("****starting TC002_LoginTest******");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccount macc=new MyAccount(driver);
		boolean target=macc.isMyAccountExists();
//		Assert.assertEquals(target, true,"Login failed");
		Assert.assertTrue(target);
		logger.info("****Finished TC002_LoginTest******");

		
		
		
		
	}
	

}
