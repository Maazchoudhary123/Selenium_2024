package PageObjectTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	 WebDriver driver;
	//constructor
	 LoginPage2(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	//Locator
//	 By text_username=By.xpath("//input[@placeholder='Username']");
//	 By text_password=By.xpath("//input[@placeholder='Password']");
//	 By btn_login=By.xpath("//button[normalize-space()='Login']");
	 @FindBy(xpath="//input[@placeholder='Username']") 
	 WebElement text_username;
	 
	 @FindBy(xpath="//input[@placeholder='Password']")
	 WebElement txt_Password;
	 @FindBy(xpath="//button[normalize-space()='Login']")
	 WebElement btn_login;
	 
	 
	 
	 
	 
	 
	//Action Methods
	 public void setUserName(String user) {
		 text_username.sendKeys(user);
	 }
	 
	 public void setPssword(String pwd) {
		 txt_Password.sendKeys(pwd);
	 }
	 public void clickBtn() {
		 btn_login.click();
	 }
	 

}
