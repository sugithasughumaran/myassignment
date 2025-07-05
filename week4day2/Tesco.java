package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tesco {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(opt);
		opt.addArguments("--disable-notification");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch tesco online shopping portal
		driver.get("https://advantageonlineshopping.com/");
		
		
		//
	    Actions action = new Actions(driver);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 // Hover over 
	    WebElement shopCategory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tabletsImg']")));
	 		action.moveToElement(shopCategory).perform();
	 		System.out.println(driver.getPageSource());
	 		Thread.sleep(1000);

	 		// shop now
	 		WebElement tablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='tabletsLink']")));
	 		tablet.click();
	 		Thread.sleep(1000);

	 		// Hover and click  product
	 		WebElement selection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cell categoryRight']/ul/li[2]")));
	 		action.moveToElement(selection).click().perform();
	 		Thread.sleep(5000);
	 		
	 		//add to cart
	 		driver.findElement(By.xpath("//div[@class='AddToCard']/label")).click();
	 		Thread.sleep(5000);
	 		
	 		driver.findElement(By.xpath("//button[@name='save_to_cart']")).click();
	 		
	 		WebElement shoppingbag = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='shoppingCartLink']")));
	 		shoppingbag.click();
	 		Thread.sleep(5000);
	 		
	 		WebElement checkout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkOutButton']")));
	 		checkout.click();
	 		
	 	// Take Screenshot
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	        // Destination location to save the screenshot
	        File dest = new File("./snap/week4day2/tablets.png");

	        // Save the screenshot
	        FileUtils.copyFile(src, dest);

	        System.out.println("Screenshot taken and saved as tablets.png");
	 		

	 		Thread.sleep(3000); 
	 		
	 		// Optional: wait to observe result
	 		
	 		driver.quit();

	}

}
