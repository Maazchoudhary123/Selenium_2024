package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo {
	@BeforeMethod
	void login() {
		System.out.println("Login success");
	}
	@Test(priority=1)
	void Search() {
		System.out.println("Search success");
	}
	@Test(priority=2)
	void AdvanceSearch() {
		System.out.println("Advance search..");
	}
	@AfterMethod
	void logout() {
		System.out.println("Logout is completed...");
	}
	
}
