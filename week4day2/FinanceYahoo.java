package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinanceYahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement more = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='More']"))); //move to More option
		
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();


        // Scroll to the element and click
       //Actions action = new Actions(driver);
 		WebElement cryptoLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Crypto")));

		// Click on "Crypto"
        action.scrollToElement(cryptoLink).perform();  // Scroll to Crypto
        cryptoLink.click();  // Click on Crypto
        
        // 4. Locate the table using <table> tag
        WebElement table = driver.findElement(By.xpath("//table"));

        // 5. Locate all rows in the table body
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        System.out.println("Cryptocurrency Names:\n----------------------");

        // 6. Iterate through rows and get first column (name)
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            if (!cols.isEmpty()) {
                String cryptoName = cols.get(0).getText();  // First column usually has name
                System.out.println(cryptoName);
            }
        }
		

	}

}
