package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class DatePicker {
	static void  selectMonthandYearDate(WebDriver driver,String Month,String Year,String Date) {
		while (true) {
		    String GetMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		    String GetYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		    if (GetMonth.equals(Month) && GetYear.equals(Year)) {
		        break; // Exit the loop when the correct month and year are found
		    }
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next button
		}
		// Select the date after the correct month and year are reached
		List<WebElement> allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		for (WebElement dt : allDate) {
		    if (dt.getText().equals(Date)) {
		        dt.click();
		        break;
		    }
		}
		
	}
	
	
	static void  selectPastMonthandYearDate(WebDriver driver,String Month,String Year,String Date) {
		while (true) {
		    String GetMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		    String GetYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		    if (GetMonth.equals(Month) && GetYear.equals(Year)) {
		        break; // Exit the loop when the correct month and year are found
		    }
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Next button
		}
		// Select the date after the correct month and year are reached
		List<WebElement> allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		for (WebElement dt : allDate) {
		    if (dt.getText().equals(Date)) {
		        dt.click();
		        break;
		    }
		}
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		
		//Method1 :Using SendKeys
		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
		
		//Method 2 Date picker
		String Year = "2020";
		String Month = "March";
		String Date = "13";

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		// Navigate to the correct month and year
//		selectMonthandYearDate(driver,Month,Year,Date);
		selectPastMonthandYearDate(driver,Month,Year,Date);
		

		

	}

}
