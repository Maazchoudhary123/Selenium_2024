package CheckBoxandAlert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
//		NORMAL ALERT WITH OK BUTTON
		
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Thread.sleep(3000);
//		Alert myAlert=driver.switchTo().alert();
//		System.out.println(myAlert.getText());
//		myAlert.accept();
		

//		CONFIMATION ALERT OK AND CENCEL
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		Alert myAlert=driver.switchTo().alert();
////		myAlert.accept();
//		myAlert.dismiss();
		
		

//		ALERT WITH INPUT BOX
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		Alert myAlert=driver.switchTo().alert();
		myAlert.sendKeys("Wlecome");
		myAlert.accept();
		
		
	}

}
