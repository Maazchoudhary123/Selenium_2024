package Selector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("Mac");
		boolean logoDisplay=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplay);
//		driver.findElement(By.linkText("Tablets")).click();
//		List<WebElement> HeaderLinks=driver.findElements(By.className("list-inline"));
//		System.out.println(HeaderLinks.size());
//		List<WebElement> HeaderLinks=driver.findElements(By.tagName("a"));
//		System.out.println(HeaderLinks.size());
		
		List<WebElement> HeaderLinks=driver.findElements(By.tagName("img"));
		System.out.println(HeaderLinks.size());

	}

}
