package Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com.gr/");
		
//		Xpath with singlr attribute
//		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("T-Shirt");
		
//	Xpath with multiple attribute
//		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-Shirt");
		
		
//		XPATH with and or operator
//		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-Shirt");
//		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("T-Shirt");
		
//		XPath with Text
//		boolean Display=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//		System.out.println(Display);
//		
//		String Displayed=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
//		System.out.println(Displayed);
//		
//		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
//		Contains XPATH
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("T-Shirt");
		
//		xpath Strats-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("T-Shirts");
		
	}

}
