package JavaScriptsExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//SCROLL BY  PIXELS
//		js.executeScript("window.scrollBy(0,1500)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//SCROLL ELEMENT TILL VIEW
//		WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//SCROLL PAGE TILL LAST
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(4000);
//		INITIAL POSITION
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		
		

		

		
		
	}

}
