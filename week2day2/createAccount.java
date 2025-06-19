package week2.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class createAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();      
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("inputBox")).sendKeys("Sugitha");
		Thread.sleep(1000);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Thread.sleep(1000);
		driver.findElement(By.id("numberEmployees")).sendKeys("16");
		Thread.sleep(1000);
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		Thread.sleep(1000);
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		
		if(title.contains("Account Details")) {
			System.out.println("Account Created, successfully.");
			
		} else {
			System.out.println("Account is not created.");
		}
		driver.quit();
		
		
	}

}
