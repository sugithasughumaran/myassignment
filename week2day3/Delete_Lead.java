package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete_Lead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		//driver.findElement(By.name("phoneCountryCode")).sendKeys("");
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("");
		driver.findElement(By.name("phoneNumber")).sendKeys("123");
		WebElement button = driver.findElement(By.xpath("//button[text()='Find Leads']"));
				button.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
		// Get the first lead ID
		WebElement firstLeadElement = wait.until(ExpectedConditions
		        .visibilityOfElementLocated(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		String leadId = firstLeadElement.getText();
		System.out.println("Lead ID number: " + leadId);
        // Click it after re-locating
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstLeadElement);

		driver.findElement(By.className("subMenuButtonDangerous")).click();
		System.out.println("Deleted");
		Thread.sleep(1000);
		// find the deleted records
		driver.findElement(By.linkText("Find Leads")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("//input[@name='id']")));  // Update this to the correct field if needed
		input.sendKeys(leadId);
		WebElement button2 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		button2.click();
		Thread.sleep(2000);
		// verification 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("x-paging-info")));

		String searchresult = driver.findElement(By.className("x-paging-info")).getText();
		if(searchresult.contains("No records to display")) {
		    System.out.println("✅ Lead " + leadId + " was successfully deleted.");
		} else {
		    System.out.println("❌ Lead " + leadId + " is still available.");
		}

		driver.quit();
	}
}
		
       
        		
        