package Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demo3x.opencartreports.com/admin/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse5']//a[contains(text(),'Customers')]")).click();
		String text=driver.findElement(By.xpath("//div[contains(text(), 'Showing 1 ')]")).getText();
		int totalpages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		//Find Total number of rows
		int noofRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		for(int i=1;i<=noofRows;i++) {
			String CustomerName=driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+i+"]//td[2]")).getText();
			String Email=driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+i+"]//td[3]")).getText();
			String Status=driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+i+"]//td[5]")).getText();
			
			System.out.println(CustomerName+"\t"+Email+"\t"+Status);

			
		}
		
	}

}
