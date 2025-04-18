package PageObjectTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 WebDriver driver;
	//constructor
	 LoginPage(WebDriver driver){
		 this.driver=driver;
	 }
	 
	//Locator
	 By text_username=By.xpath("//input[@placeholder='Username']");
	 By text_password=By.xpath("//input[@placeholder='Password']");
	 By btn_login=By.xpath("//button[normalize-space()='Login']");
	 
	//Action Methods
	 public void setUserName(String user) {
		 driver.findElement(text_username).sendKeys(user);
	 }
	 
	 public void setPssword(String pwd) {
		 driver.findElement(text_password).sendKeys(pwd);
	 }
	 public void clickBtn() {
		 driver.findElement(btn_login).click();
	 }
	 

}
