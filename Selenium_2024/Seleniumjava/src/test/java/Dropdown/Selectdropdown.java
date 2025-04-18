package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectdropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement DrpdownCtr=driver.findElement(By.xpath("//select[@id='country']"));
//		SELECT OPTION FROM DROPDOWN
		
		Select DrpCtr=new Select(DrpdownCtr);
//		DrpCtr.selectByVisibleText("France");
//		DrpCtr.selectByValue("japan");
//		DrpCtr.selectByIndex(2);

		
//		CAPTURE THE OPTIONS FROM THE DROPDOWN
		List<WebElement>Options=DrpCtr.getOptions();
		System.out.println(Options.size());
		
//		for(int i=0;i<Options.size();i++) {
//			System.out.println(Options.get(i).getText());
//		}
		
//		Another FOR Loop
		for(WebElement op:Options) {
			System.out.println(op.getText());
		}
		
	}

}
