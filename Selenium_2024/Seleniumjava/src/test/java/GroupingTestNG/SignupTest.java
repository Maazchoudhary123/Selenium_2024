package GroupingTestNG;

import org.testng.annotations.Test;

public class SignupTest {
	@Test(priority=1,groups= {"regression"})
	void signupEmail() {
		System.out.println("sign up email");
	}
	@Test(priority=2,groups= {"regression"})
	void signupFacebook() {
		System.out.println("sign up by Facebook");
	}
	@Test(priority=3,groups= {"regression"})
	void signupTwitter() {
		System.out.println("sign up by twitter");
	}
	
	
	
	

}
