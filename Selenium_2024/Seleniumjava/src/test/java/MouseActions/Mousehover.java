package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mousehover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement Desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement Mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']']"));
		Actions act=new Actions(driver);
		act.moveToElement(Desktop).moveToElement(Mac).click().build().perform();

	}

}
