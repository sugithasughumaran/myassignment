package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class editLead {

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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Turare");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sugitha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sughumaran");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("meenu");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sugitha@gmail.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select statedropdown = new Select(state);
		statedropdown.selectByValue("TX");
		Thread.sleep(1000);
		// form submitted and lead created
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Lead is created.");
		
		Thread.sleep(1000);
		
		// to edit the lead
		driver.findElement(By.xpath("//a[@class='subMenuButton'][contains(text(), 'Edit')]")).click();
		driver.findElement(By.id("updateLeadForm_description")).sendKeys(" ");
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Editing Lead");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		// to know if the page is updated
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		if(title.contains("View Lead | opentaps CRM")) {
			System.out.println("Edit is done successfully.");
		} else {
		System.out.println("Edit Lead is done.");
		}
		Thread.sleep(1000);
		driver.quit();
	}
	

}
