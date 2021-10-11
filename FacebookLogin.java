package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com");
		// Step 4: Maximize the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Christan");
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Cornelius");
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9901234567");
		// Step 10: Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("@123Abc");
		// Step 11: Handle all the three drop downs
		WebElement eleDay = driver.findElement(By.id("day"));
		Select dd1=new Select(eleDay);
		dd1.selectByValue("2");
		WebElement eleMonth = driver.findElement(By.id("month"));
		Select dd2=new Select(eleMonth);
		dd2.selectByIndex(2);
		WebElement eleYear = driver.findElement(By.id("year"));
		Select dd3=new Select(eleYear);
		dd3.selectByVisibleText("2000");
		// Step 12: Select the radio button "Female" 
		//driver.findElement(By.linkText("Female")).click();
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		
	}

}
