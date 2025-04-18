package CheckBoxandAlert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		1)FOR SINGLE CHECKBOX
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();

//		FOR MULTIPLE CHECKBOXES
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
//		for(int i=0;i<checkbox.size();i++) {
//			checkbox.get(i).click();
//		}
		
//		for(WebElement checkboxes:checkbox) {
//			checkboxes.click();
//		}
		
//		SELECT LAST 3 CHECKBOX
//		for(int i=4;i<checkbox.size();i++) {
//			checkbox.get(i).click();
//		}
		
//		UNSELECT THE CHECKBOX OF THEY ARE SELECTED 
		for(int i=0;i<3;i++) {
			checkbox.get(i).click();
		}
		Thread.sleep(2000);
		for(int i=0;i<checkbox.size();i++) {
			if(checkbox.get(i).isSelected()) {
				checkbox.get(i).click();
			}
		}
		
	}

}
