package Slider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SlederDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		//Minimum Slider
//		WebElement min_loc=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]")); //(59 ,289) (x,y)
//		System.out.println(min_loc.getLocation());
//		Actions act=new Actions(driver);
//		act.dragAndDropBy(min_loc, 100, 289).perform();
//		System.out.println("Location after move"+min_loc.getLocation()); //(158,294) (X,y)
		
		//Maximum slider
		WebElement max_loc=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		System.out.println("location before move"+max_loc.getLocation()); //(766, 294) (x, y)
		Actions act =new Actions(driver);
		act.dragAndDropBy(max_loc, -110, 294).perform();
		System.out.println("location after move"+max_loc.getLocation()); //(653, 294) (x, y)

		
		
		

	}

}
