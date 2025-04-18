package Selector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		String text = driver.findElement(By.xpath("//a[contains(text(),'L&T')]/self::a")).getText();
		System.out.println("Self : " + text); // L&T

		// Parent - Selects the parent of the current node (always One)
		text = driver.findElement(By.xpath("//a[contains(text(),'L&T')]/parent::td")).getText(); // there is
		System.out.println("Parent : " + text); // L&T
		
		List<WebElement> ancestors = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr"));
		System.out.println("Number of ancestor elements: " + ancestors.size()); // 5

		// Descendant - Selects all descendants (children, grandchildren, etc.) of the current node
		List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant nodes: " + descendants.size()); // 7

		// Following - Selects anything in the document after the closing tag of the current node
		List<WebElement> followingNodes = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes: " + followingNodes.size()); // 267

		// Preceding - Selects all nodes that appear before the current node in the document
		List<WebElement> precedings = driver.findElements(By.xpath("//a[contains(text(),'L&T')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of preceding nodes: " + precedings.size()); // 31

	}

}
