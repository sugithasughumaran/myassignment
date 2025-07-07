package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class salesforceParam {

public static WebDriver driver;
	
	@Parameters({"url", "Username", "password", "browser"})
	@BeforeMethod
	void preCondition(String url, String Username, String password, String browser) {
			
		switch (browser.toLowerCase()) {
		case "edge":
			driver = new EdgeDriver();
			break;
		
		case "firefox":
			driver = new FirefoxDriver();
			break;
		
	    default:
	    	ChromeOptions options = new ChromeOptions();
			options.addArguments("guest");
			driver = new ChromeDriver(options);
			break;		
		}
		
	    driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		
		driver.close();
	}

}

