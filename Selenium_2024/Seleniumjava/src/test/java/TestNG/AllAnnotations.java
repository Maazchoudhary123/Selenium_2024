package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	@AfterSuite
	void as() {
		System.out.println("this is afater suite..");
	}
	@BeforeSuite
	void bs() {
		System.out.println("this is before suite");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("this is before Test...");
	}
	
	@AfterTest
	void at() {
		System.out.println("this is after test from c2");
	}
	@BeforeClass
	void bc() {
		System.out.println("this is before class..");
	}
	@AfterClass
	void AC() {
		System.out.println("this is after class");
	}
	@BeforeMethod
	void BM() {
		System.out.println("this is before method..");
	}
	@AfterMethod
	void AM() {
		System.out.println("This is After Method");
	}
	@Test(priority=1)
	void TM1() {
		System.out.println("this is the Test Method1...");
	}
	@Test(priority=2)
	void TM2() {
		System.out.println("this is Test method2..");
	}

}
