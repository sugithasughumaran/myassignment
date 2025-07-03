package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class phonePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		try {
		    WebElement continueBtn = driver.findElement(By.xpath("//*[contains(text(),'Click the button below to continue shopping')]"));
		    if (continueBtn.isDisplayed()) {
		        driver.findElement(By.className("a-button-text")).click();
		    }
		} catch (Exception e) {
		    // Button not found, continue
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> phone = driver.findElements(By.className("a-price-whole"));
		List<Integer> price = new ArrayList<>();
		
		for (WebElement pricetag : phone) {
		    String text = pricetag.getText().replace(",", "").trim();
		    	// to verify the there is not empty space
		    if (!text.isEmpty()) {
		        try {
		        	// to convert string to integer
		            int priceValue = Integer.parseInt(text);
		            price.add(priceValue);
		        } catch (NumberFormatException e) {
		           // just skip
		        }
		    } else {
		        System.out.println("Skipped empty price element");
		    }
		}
        // sorting based ascender order
        Collections.sort(price);
        System.out.println("Price based on low to highest: ");
        System.out.println(price);
        System.out.println("The cheapest phone price is " + price.get(0));
    	driver.quit();
        }
	

	
}
