package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertionDemo {
	@Test
	void Testtitle() {
		 String exp_title="Opencart";
		 String act_title="Opencart";
		 if(exp_title.equals(act_title)) {
			 System.out.println("Test is passed");
			 Assert.assertTrue(true);
		 }
		 
		 else {
			 System.out.println("Test is Failed");
			 Assert.assertTrue(false);

		 }
//		 Assert.assertEquals(exp_title, act_title);
	}

}
