package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass{
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class,groups="Datadriven")
	public void verify_loginDDT(String email,String pwd,String exp) {
		// Home page actions
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();

		// Login page actions
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();

		// My Account page verification
		MyAccount macc = new MyAccount(driver);
		boolean targetPage = macc.isMyAccountExists();
		
		if(exp.equalsIgnoreCase("valid"))
		{
			if(targetPage==true) {
				Assert.assertTrue(true);
				macc.CLickLogout();
			}
			else {
				Assert.assertTrue(false);
			}
			if(exp.equalsIgnoreCase("Invalid")) {
				if(targetPage==true) {
					macc.CLickLogout();
					Assert.assertTrue(false);
				}
				else {
					Assert.assertTrue(true);
				}
			}
		}
		
	}
	

}
