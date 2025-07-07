package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class createId extends Parameterization {
	
	
	
	@Test
	public void createlead() {
	
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();

	driver.findElement(By.className("inputBox")).sendKeys("Sugitha332");

	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

	driver.findElement(By.id("numberEmployees")).sendKeys("16");

	driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");

	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	
	if(title.contains("Account Details")) {
		System.out.println("Account Created, successfully.");
		
	} else {
		System.out.println("Account is not created.");
	}

	}

}
