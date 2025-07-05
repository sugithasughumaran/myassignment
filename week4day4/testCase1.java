package week4.day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testCase1 extends ProjectSpecificMethodd {
	
	@Test
	void testsalesforce() {
		
		String parentwindows = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		
		List<String> windowhandles = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowhandles.get(1));
		
		WebElement legal = driver.findElement(By.xpath("p[text()='Legal Entities']"));
		legal.click();
		driver.close();
		
		driver.switchTo().window(parentwindows);
		driver.findElement(By.xpath("//a[@class='slds-button slds-button_reset']")).click();
		driver.findElement(By.linkText("New Legal Entity")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Salesforce Automation by Sugitha");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String Name = driver.findElement(By.xpath("//div[contains(text(),'Sugitha')]")).getText();
		if(Name.contains("Sugitha")) {
			System.out.println("Verified name is available.");
		} else {
			System.out.println("Name is not available.");
		}
	}


}

