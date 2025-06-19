package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main/.");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();      
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("inputBox")).sendKeys("Sugitha2");
		Thread.sleep(1000);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Thread.sleep(1000);
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industrydropdown = new Select(industry);
		industrydropdown.selectByIndex(3);
		Thread.sleep(1000);
		WebElement cooperate = driver.findElement(By.name("ownershipEnumId"));
		Select cooperatedropdown = new Select(cooperate);
		cooperatedropdown.selectByVisibleText("S-Corporation");
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select sourcedropdown = new Select(source);
		sourcedropdown.selectByValue("LEAD_EMPLOYEE");
		Thread.sleep(1000);
		WebElement Campaign = driver.findElement(By.id("marketingCampaignId"));
		Select Campaigndropdown = new Select(Campaign);
		Campaigndropdown.selectByIndex(6);
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select statedropdown = new Select(state);
		statedropdown.selectByValue("TX");
		Thread.sleep(1000);
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		
		if(title.contains("Account Details")) {
			System.out.println("Verified, account created successfully.");
			
		} else {
			System.out.println("Account is not created.");
		}
		driver.quit();
		
		
	}

}
