package Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
//		tag id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirt");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirt");
		
//		tag class  tag.classname
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");
		
		
// 	tag attribute tag[attribute='value']
//		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirt");
		
//		Tag class attribute
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-Shirt");
	}

}
