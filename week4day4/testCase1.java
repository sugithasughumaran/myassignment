package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testCase1 extends ProjectSpecificMethodd {
	
	@Test
	void testsalesforce() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       
        // Step 2: Toggle menu
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

        // Step 3: View All
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        Thread.sleep(2000);
        
     // CLICK ON LEGAL AUTHOROTIES
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
          WebElement legalEntities = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//p[text()='Legal Entities']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", legalEntities);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", legalEntities);
        
        
     		// CLICK ON THE DROPDOWN ICON 
     		WebElement DropDown = driver.findElement(By.xpath("//span[text()='Legal Entities List']/ancestor::a"));
     		DropDown.click();
     		Thread.sleep(1000);
     		
     		// Click on Legal Entity
     		WebElement NewLegal = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
     		js.executeScript("arguments[0].click();", NewLegal);
     		Thread.sleep(0500);
	
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Sugitha");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		// Find the created record
		String Name = driver.findElement(By.xpath("//div[contains(text(),'Sugitha')]")).getText();
		if(Name.contains("Sugitha")) {
			System.out.println("Verified name is available.");
		} else {
			System.out.println("Name is not available.");
		}
	}


}

