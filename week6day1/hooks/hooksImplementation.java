/*package hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import based.base;
import based.week6d1base;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class hooksImplementation extends week6d1base {
	@Before
	public void PreConditions(){
		String url = "http://leaftaps.com/opentaps/";
		String Username = "demosalesmanager";
		String password = "crmsfa";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}
	
	@After
	public void PostConditon() {
		if (driver != null) {
		driver.quit();
    }

}
	
}*/
