package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interactions_with_Checkboxes {
	
	public static void main(String[] args) throws InterruptedException {
		

	ChromeDriver driver;
	
	driver = new ChromeDriver();
	driver.get("https://leafground.com/checkbox.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//click the basic checkbox
	WebElement basiccb = driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[contains(@class,'ui-chkbox-box')]"));
	basiccb.click();
	
	WebElement notification = driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[contains(@class,'ui-chkbox-box')]"));
	notification.click();
	
	System.out.println("Basic and Notification is checked");
	
	WebElement lang = driver.findElement(By.xpath("//label[text()='Java']"));
	lang.click();
	
	WebElement tri = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//div[contains(@class,'ui-chkbox-box')]"));
			tri.click();
			
			System.out.println("Tri State is selected.");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	
	driver.findElement(By.className("ui-toggleswitch-slider")).click();
	
	WebElement disable = driver.findElement(By.xpath("//div[@class='grid formgrid']//input[@disabled='disabled']"));
	if(disable.isEnabled()) {
		System.out.println("This is not disabled");
	} else {
		System.out.println("It is disabled");
	}
	
	WebElement state = driver.findElement(By.xpath("//ul[@data-label='Cities']"));
	boolean citydisplayed = state.isDisplayed();
	if (citydisplayed) {
		System.out.println("City is displayed.");
	}
	
    Thread.sleep(3000);
  
   driver.findElement(By.xpath("//label[contains(text(),'Rome')]/preceding-sibling::div")).click();


	Thread.sleep(3000);

	// Select Istanbul and Rome from the dropdown
	driver.findElement(By.xpath("//label[contains(text(),'Istanbul')]/preceding-sibling::div")).click();

	System.out.println("Istanbul and Rome is selected.");
	
	Thread.sleep(1000);
	
	driver.quit();
	}
}
