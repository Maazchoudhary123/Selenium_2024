package GroupingTestNG;

import org.testng.annotations.Test;

public class PaymentTest {
	@Test(priority=1,groups= {"sanity","regression"})
	void paymentrupee() {
		System.out.println("payment in ruppess");
	}
	@Test(priority=2,groups= {"sanity","regression"})
	void paymentdoller() {
		System.out.println("payment in ruppess");
	}

}
