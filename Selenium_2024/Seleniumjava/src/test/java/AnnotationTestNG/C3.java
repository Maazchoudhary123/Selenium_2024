package AnnotationTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	
	@Test
	void pqr() {
		System.out.println("this pqr class");
	}
	@AfterSuite
	void as() {
		System.out.println("this is afater suite..");
	}
	@BeforeSuite
	void bs() {
		System.out.println("this is before suite");
	}

}
