package DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String reqYear="2020";
		String reqMonth="Jul";
		String reqDate="12";
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		WebElement YearDropDown=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select selectYear=new Select(YearDropDown);
		selectYear.selectByVisibleText(reqYear);
		
		WebElement MonthDropdown=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select selectMonth=new Select(MonthDropdown);
		selectMonth.selectByVisibleText(reqMonth);
		
		driver.findElement(By.xpath("//a[normalize-space()='13']")).click();
//		WebElement Selectdate=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
//		Select selectdate=new Select(Selectdate);
//		selectdate.selectByVisibleText(reqDate);
		
		
		
		

	}

}
