package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class snapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver;
		driver = new ChromeDriver();
		String parentWindow = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//launch snapdeal sited
		driver.get("https://www.snapdeal.com/");
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		try {
		    WebElement popup = driver.findElement(By.className("pushAllow"));
		    popup.click();
		} catch (Exception e) {
		    // Ignore if popup is not present
		}
		Thread.sleep(1000);
		
		WebElement mens = driver.findElement(By.linkText("Men's Fashion"));
		Actions action = new Actions(driver);
		action.moveToElement(mens).perform();
		Thread.sleep(1000);
		
		WebElement sportshoe = driver.findElement(By.linkText("Sports Shoes"));
		sportshoe.click();
	
		
		WebElement countshoe = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
	    System.out.println(countshoe.getText());
	    
	    action.moveToElement(driver.findElement(By.xpath("//div[text()='Training Shoes']"))).click().pause(2000).perform();
	    Thread.sleep(1000);
	    action.moveToElement(driver.findElement(By.xpath("//div[@class='sort-drop clearfix']/i"))).click().pause(2000).perform();
	    Thread.sleep(1000);
	    action.moveToElement(driver.findElement(By.xpath("//li[@class='search-li'][1]"))).click().pause(2000).perform();
	    Thread.sleep(1000);
	    
	    List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	    List<Integer> originalPrices = new ArrayList<>();
	    
	    for (WebElement priceElement : priceElements) {
	        String priceText = priceElement.getText().replaceAll("[^0-9]", ""); // Remove ₹ and commas
	        if (!priceText.isEmpty()) {
	            originalPrices.add(Integer.parseInt(priceText));
	        }
	    }
	    // verifying if the price is based on low to high
	    List<Integer> sortedPrices = new ArrayList<>(originalPrices);
	    Collections.sort(sortedPrices);

	    if (originalPrices.equals(sortedPrices)) {
	        System.out.println("✅ Prices are sorted in ascending order.");
	    } else {
	        System.out.println("❌ Prices are NOT sorted correctly.");
	    }
	    //insert low range
	   WebElement min = driver.findElement(By.name("fromVal"));
	    min.clear();
	    min.sendKeys("500");
	    System.out.println("Min range value: 500");
	    // insert high range
	    WebElement max = driver.findElement(By.name("toVal"));
	    max.clear();
	    max.sendKeys("700");
	    System.out.println("The max range value: 700");
	    driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
	    
	    WebElement color = driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']"));
	    color.click();
	    System.out.println(color.getText());
	    Thread.sleep(2000);
	    
	    // click the first product after color and price filter
	    action.moveToElement(driver.findElement(By.xpath("//div[@class='product-tuple-image '][1]/a"))).click().perform();
	    // switching the window
	    List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(windowHandles.get(1)); // switch to newly opened tab/window
	    
	    // print the price
	    WebElement pricshoe = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
	    System.out.println(pricshoe.getText());
	    
	   // print the discount
	    WebElement discount = driver.findElement(By.xpath("//span[@class='pdpDiscount ']"));
	    System.out.println(discount.getText() + "%");
	    
	     
	 // Take Screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Destination location to save the screenshot
        File dest = new File("./snap/week4day2/snapDeal.png");

        // Save the screenshot
        FileUtils.copyFile(src, dest);
        // close the shoe description window
        driver.close();
        
     // Switch back to the parent window
        driver.switchTo().window(parentWindow);  
		
	}

}
