package RVT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class basic {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(80));
		
		try {
		    driver.get("https://r1132101364647-eu1-renaultlci-ifwe.3dexperience.3ds.com/#dashboard:0a92539a-f0ab-4afa-bcb5-44510a6fccfb/tab:Test1");
		    driver.manage().window().maximize();

		    // Wait for the button to be clickable
		    WebElement acceptAllButton = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept All']")));
		    acceptAllButton.click();
		} finally {
//		    driver.quit();
			WebElement frame = myWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//iframe[contains(@id,'frame-A3anx')])[1]")));
			driver.switchTo().frame(frame);
			WebElement Doubleclick=myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='prd-DXSRE701-00367875']")));
			Actions act=new Actions(driver);
			act.doubleClick(Doubleclick).perform();
			  WebElement acceptAllButton = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='wux-layouts-treeview-expander']")));
			  acceptAllButton.click();
			  WebElement Button1 = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(("(//div[@class='wux-layouts-treeview-expander'])[3]"))));
			  Button1.click();
			WebElement capClick=myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@id='iconAuthImg']")));
			capClick.click();
//			WebElement cap = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='X8310_DMU']")));
//			cap.click();
//			driver.switchTo().defaultContent();
//			WebElement max = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='fullscreen-icon ifwe-action-icon fonticon fonticon-resize-fullscreen clickable '])[2]")));
//			max.click();
			
			
			
//DRAG AND DROP
			WebElement cap1=myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='X8310_DMU']")));
			driver.switchTo().defaultContent();
			WebElement frame2 = myWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//iframe[contains(@id,'frame-A3anx')])[2]")));
			driver.switchTo().frame(frame2);
			WebElement widget=driver.findElement(By.xpath("//span[text()='Authoring Context']"));
			act.dragAndDrop(cap1, widget).perform();
			
//			// Wait for the source element to be clickable and locate it
//			WebElement cap1 = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='X8310_DMU']")));
//
//			// Switch back to the default content
//			driver.switchTo().defaultContent();
//
//			// Locate and switch to the first iframe containing the source element
//			WebElement frame1 = myWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//iframe[contains(@id,'frame-A3anx')])[1]")));
//			driver.switchTo().frame(frame1);
//
//			// Locate the source element within the first iframe
//			cap1 = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='X8310_DMU']")));
//
//			// Switch back to the default content
//			driver.switchTo().defaultContent();
//
//			// Locate and switch to the second iframe containing the target element
//			WebElement frame2 = myWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//iframe[contains(@id,'frame-A3anx')])[2]")));
//			driver.switchTo().frame(frame2);
//
//			// Locate the target element within the second iframe
//			WebElement widget = myWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Authoring Context']")));
//
//			// Switch back to the default content to perform the drag-and-drop operation
////			driver.switchTo().defaultContent();
//
//			// Perform the drag-and-drop operation using Actions class
//			act.clickAndHold(cap1)
//			   .moveToElement(widget)
//			   .release(widget)
//			   .build()
//			   .perform();
		 
		
			
		}
	

	

	}

}
