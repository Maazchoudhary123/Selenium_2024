package TestNG;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1)
	public void loginTest() {
		System.out.println("Login successfully");
		
	}
	@Test(priority=2)
	public void registerTest() {
		System.out.println("confirm");
	}
	@Test(priority=3)
	public void Logout()
	{
		System.out.println("Logout successfully");
	}
}
