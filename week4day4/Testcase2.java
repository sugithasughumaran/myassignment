package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testcase2 extends ProjectSpecificMethodd {
	
	@Test
	 public void runCreateLegalEntityValidation() throws InterruptedException {
		
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
     		
     		// CLICK ON NEW LEGAL ENTITY
     		WebElement NewLegal = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
     		js.executeScript("arguments[0].click();", NewLegal);
     		Thread.sleep(0500);
  
        // Step 6: Fill fields (leave Name empty to trigger validation)
     		driver.findElement(By.xpath("//label[text()='Company Name']/following::input[1]")).sendKeys("TestLeaf");
        driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
      
        // Click the dropdown
        //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement statusDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Status']")));

        if (statusDropdown.isDisplayed() && statusDropdown.isEnabled()) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", statusDropdown);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", statusDropdown);
        }
        
        // Select the option 'Active'
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Active']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        
        //alert
        WebElement alertMsg = driver.findElement(By.xpath("//div[contains(@class,'field-level-help') or contains(@class,'form-element__help')][contains(text(),'Complete this field.')]"));

        if (alertMsg.isDisplayed()) {
            System.out.println("✅ Validation message displayed: " + alertMsg.getText());
        }
    }
}