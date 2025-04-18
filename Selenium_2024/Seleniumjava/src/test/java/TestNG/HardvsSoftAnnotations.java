package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class HardvsSoftAnnotations {
	@Test
	void test_hardassertions() {
		System.out.println("testing...");
		System.out.println("testing...");
		Assert.assertEquals(1, 1);   //hard assertion
		System.out.println("testing...");
		System.out.println("testing...");
		
	}
	@Test
	void test_softAssertion() {
		System.out.println("testing...");
		System.out.println("testing...");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);   //hard assertion
		System.out.println("testing...");
		System.out.println("testing...");
		sa.assertAll();
		
	}

}
