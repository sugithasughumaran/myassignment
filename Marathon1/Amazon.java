package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

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
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement searchresult = driver.findElement(By.xpath("(//div[@class='sg-col-inner']//h2)[1]"));
			System.out.println("The Search result displayed = " + searchresult.getText());
	    driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
	    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
        //driver.findElement(By.xpath("(//a[@id='s-result-sort-select_4'])")).click();
	    WebElement sortDropdown = driver.findElement(By.id("s-result-sort-select"));
	    Select sort = new Select(sortDropdown);
	    sort.selectByVisibleText("Newest Arrivals");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    WebElement firstProduct = driver.findElement(By.xpath("(//div[@data-cel-widget=\"search_result_3\"])"));
	    String title = firstProduct.findElement(By.xpath("(//a/h2/span)")).getText();
	    System.out.println("Product Description: " + title);
	    
	    try {
            String priceWhole = firstProduct.findElement(By.xpath(".//span[@class='a-price-whole']")).getText();
            String priceFraction = firstProduct.findElement(By.xpath(".//span[@class='a-price-fraction']")).getText();
            System.out.println("Product Price: ₹" + priceWhole + "." + priceFraction);
        } catch (Exception e) {
            System.out.println("Price not available for this product.");
        }

         driver.quit();
    }
}
	  
	     
			
		 
		 
		 

