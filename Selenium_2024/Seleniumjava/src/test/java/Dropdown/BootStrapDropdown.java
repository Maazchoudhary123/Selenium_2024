package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrapDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]")).click();
//		SELECT SINGLE OPTIONS
//		driver.findElement(By.xpath("//input[@value='Java']")).click();

//		SELECT ALL THE AND GET SIZE
		List<WebElement> Count=driver.findElements(By.xpath("//ul[contains(@class, 'multiselect-contain')]//label"));
		System.out.println(Count.size());
		
//		for(int i=0; i<Count.size();i++) {
//			System.out.println(Count.get(i).getText());
//		}
		for(WebElement opt:Count) {
			System.out.println(opt.getText());
		}
//		SELECT MULTIPLE OPTIONS
		for(WebElement opt:Count) {
			String option=opt.getText();
			if(option.equals("Java") || option.equals("Python") || option.equals("MySQL")) {
				
			opt.click();
			}
		}
	}

}
