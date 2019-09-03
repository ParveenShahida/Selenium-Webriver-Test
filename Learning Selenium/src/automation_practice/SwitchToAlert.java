package automation_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) {
		
		System.setProperty ("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		    Go to http://www.automationpractice.com
		
		driver.get("http://www.automationpractice.com");
		
//			Click Sign in button from top right corner of the page
		driver.findElement(By.id("login-overlay")).click();
		
//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		
//			Enter valid password 'abc1234' in password text field
//			Click 'Sign in' button
//			Click MY WISH LISTS button
//			Enter 'My Winter Shopping' in name test field
//			Click Save button
//			Verify new wish list created with name = 'My Winter Shopping', Qty=0, Viewed=0, Created=today's date, Direct Link = View
//			Delete the created wish list item
//			Click OK from the alert popup
//			Verify wishlist item is removed

	}

}
