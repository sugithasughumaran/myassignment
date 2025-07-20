package hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import based.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hookssfwsixdone extends base {
	
	@Before
	public void preconditionsf() {
		
		String url = "https://login.salesforce.com/";
		String Username = "bhuvanesh.moorthy@testleaf.com";
		String password = "Leaf@2025";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}
	@After
	public void postconditionsf() {
		driver.quit();
	}

}
