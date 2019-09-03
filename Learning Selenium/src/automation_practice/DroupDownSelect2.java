package automation_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automation.Base;



public class DroupDownSelect2 {
	
	@Test

	public static void AutomationPractice() {
		
		
		WebDriver driver = Base.getDriver();
		
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
		
		//Select 'Webmaster' from Subject Heading drop down
		
		WebElement element = driver.findElement(By.id("id_contact"));
		
		Select droupdown = new Select(element);
		
		droupdown.selectByVisibleText("Webmaster");
		
		//Type message 'I have not received my order yet' in Message text area
		driver.findElement(By.id("message")).sendKeys("I have not received my order yet");
				
		//Click Send button
		driver.findElement(By.id("submitMessage")).click();
				
		
		
		
		
		

	}

}
