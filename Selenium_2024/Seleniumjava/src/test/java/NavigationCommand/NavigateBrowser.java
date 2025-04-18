package NavigationCommand;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBrowser {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

//		driver.get("https://demo.nopcommerce.com/register");
//		driver.navigate().to("https://demo.nopcommerce.com/register");
		URL myurl=new URL("https://demo.nopcommerce.com/register");
		driver.navigate().to(myurl);
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());


	}

}
