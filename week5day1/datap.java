package week5.day1;

	
    import java.time.Duration;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;

	public class datap {

	public static WebDriver driver;
		
		@Parameters({"url", "Username", "password"})
		@BeforeMethod
		void preCondition(String url, String Username, String password) throws InterruptedException {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("guest");
			driver = new ChromeDriver(options);
		    driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.id("username")).sendKeys(Username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("Login")).click();
			
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
	     		
	     		// Click on Legal Entity
	     		WebElement NewLegal = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
	     		js.executeScript("arguments[0].click();", NewLegal);
	     		Thread.sleep(1000);
		
		}
		
		@AfterMethod
		public void postCondition() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.close();
		}


	}
