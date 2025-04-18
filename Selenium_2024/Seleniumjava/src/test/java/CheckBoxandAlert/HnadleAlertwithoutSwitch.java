package CheckBoxandAlert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HnadleAlertwithoutSwitch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get(Messages.getString("HnadleAlertwithoutSwitch.0")); //$NON-NLS-1$
		driver.manage().window().maximize();
//		NORMAL ALERT WITH OK BUTTON
		
		driver.findElement(By.xpath(Messages.getString("HnadleAlertwithoutSwitch.1"))).click(); //$NON-NLS-1$
		Thread.sleep(3000);
		Alert myAlert=myWait.until(ExpectedConditions.alertIsPresent());
//		Alert myAlert=driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();
	}

}
