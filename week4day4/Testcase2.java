package week4.day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends ProjectSpecificMethodd {
	
	@Test
	void runSalesforce() {
		
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
		driver.findElement(By.name("CompanyName")).sendKeys("'TestLeaf");
		driver.findElement(By.xpath("//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforce");
		//List<WebElement> status = driver.findElements(By.xpath("//ul[@role='presentation']"));
		//List<Integer> actives = new ArrayList<>();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
	    try {
            WebElement message1 = driver.findElement(By.xpath("//h2[contains(text(),'We hit a snag.')]"));
            String actualMessage = message1.getText();

            if (actualMessage.equalsIgnoreCase("We hit a snag.")) {
                System.out.println("Alert pop-up: name might be empty.");
            } else {
                System.out.println("No alert message pop-up.");
            }
        } catch (Exception e) {
            System.out.println("No alert message found. Possibly saved successfully.");
        }
		
		
	}

}
