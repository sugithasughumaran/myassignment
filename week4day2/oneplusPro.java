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

public class oneplusPro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions opt = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(opt);
		opt.addArguments("--disable-notification");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		//first page to skip
		try {
		    WebElement continueBtn = driver.findElement(By.xpath("//*[contains(text(),'Click the button below to continue shopping')]"));
		    if (continueBtn.isDisplayed()) {
		        driver.findElement(By.className("a-button-text")).click();
		    }
		} catch (Exception e) {
		    // Button not found, continue
		}
		//find the product and printout the price and number of customer reviewed
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement phone = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
		String textphone = phone.getText();
		System.out.println("The phone price: " + textphone);
		WebElement rating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text'][1]"));
		String ratingstar = rating.getText();
		System.out.println("The total number of reviewer: " + ratingstar);
		driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal']")).click();
		
		// Take Screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Destination location to save the screenshot
        File dest = new File("./snap/week4day2/oneplusphone.png");

        // Save the screenshot
        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot taken and saved as screenshot.png");
        
        // get the price of the product
        driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
        WebElement subtotal = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        String subtotal1 = subtotal.getText();
        // verifying the price before and after adding to cart
        if(textphone.matches(subtotal1)) {
        	System.out.println("Verified the amount display in cart is same amount as per before adding to cart.");
        } else {
        	System.out.println("The amount showing different value. Before adding to cart " + textphone + "after adding to cart " + subtotal1);
        }
     // closing the amazon
        driver.close();
	}

}
