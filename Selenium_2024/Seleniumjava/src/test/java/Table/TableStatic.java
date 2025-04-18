package Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableStatic {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("numberof rows:" +rows);
		
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("numberof rows:" +cols);
		
//		int rows=driver.findElements(By.xpath("//tr")).size();
//		System.out.println("numberof rows:" +rows);
		
//		int rows=driver.findElements(By.tagName("th")).size();  //single table
//		int cols=driver.findElements(By.xpath("//th")).size();  //multiple tables
//		System.out.println("numberof rows:" +rows);
		
		String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(Bookname);
		
		String Bookname1=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[3]")).getText();
		System.out.println(Bookname1);
		
		//Read data from all row and column
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				String Value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(Value+"/t");
			}
			System.out.println();
		}
//		PRINT BOOK NAM EWHOSE AUTHOR IS MUKESH
		for(int r=2;r<rows;r++) {
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorname.equals("Mukesh")){
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookname+"\t"+authorname);
			}
		}
//		FIND TOTAL PRICE OF ALL BOOKS
		int Total=0;
		for(int r=2;r<rows;r++) {
			String Price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			Total=Total+Integer.parseInt(Price);
		}
		System.out.println("Total price of all Books:"+Total);

	}

}
