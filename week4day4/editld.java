package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class editld extends creatld {
	
	
	@Test
   public void edit() throws InterruptedException {
	
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Turare");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sugitha322");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sughumaran");
	driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("meenu");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sugitha4554@gmail.com");
	WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select statedropdown = new Select(state);
	statedropdown.selectByValue("TX");
	Thread.sleep(1000);
	// form submitted and lead created
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println("Lead is created.");

	}
}
