package automation_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automation.Base;



public class DropDownSelect  {
	

	@Test
	public void Send_message_with_order_reference_using_contact_us_form() {
		
		System.setProperty ("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
		//Click Sign in button from top right corner of the page
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		//Enter valid email address 'abc213@mailinator.com' in email address text field of right side
				driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
				
		//Enter valid password 'abc1234' in password text field
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abc1234");
				
		//Click 'Sign in' button
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
				
		//Click Contact us button from top right menu
		driver.findElement(By.xpath("//div[@id='contact-link']")).click();
		
		//Select 'Customer 'Service' from Subject Heading drop down
		
        WebElement element=driver.findElement(By.id("id_contact"));
		Select droupdown = new Select(element);
		droupdown.selectByVisibleText("Customer service");
						
		//Select 'OVSNICQGG - 11/27/2018' from Order reference drop down
		driver.findElement(By.xpath("//select[@name='id_order']")).sendKeys("OVSNICQGG - 11/27/20188");
		
		
		//Select product button
		
		WebElement product= driver.findElement(By.id("84033_order_products"));
		Select droupdoun = new Select (product);
		droupdoun.selectByVisibleText("Printed Dress - Color : Orange, Size : S");
		
		//Type message 'I have not received my order yet' in Message text area
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("I have not received my order yet");
		
			
		
		//Click Send button
		driver.findElement(By.xpath("//div[@class='submit']")).click();
		
		
		//Upload a text file in Attach file option
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\HP\\Desktop\\Test file.txt");
		
		

	}

}
