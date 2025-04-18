package DAY1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--headless=new");
//		
//		WebDriver driver=new ChromeDriver(option);
//		driver.get("https://demo.opencart.com.gr/");
//		String act_title=driver.getTitle();
//		if(act_title.equals("Your Store"))
//		{
//			System.out.println("Test Passed");
//		}
//		else {
//			System.out.println("Failed");
//		}
//		driver.close();
//	}
//
//}

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
        option.addArguments("--disable-gpu");
        option.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(option);
        driver.get("https://demo.opencart.com.gr/");

        String act_title = driver.getTitle();
        if (act_title.equals("Your Store")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Failed");
        }

        driver.close();
    }
}
