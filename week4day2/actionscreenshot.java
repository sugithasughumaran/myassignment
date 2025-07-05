package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.OutputType;

public class actionscreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement condi =  driver.findElement(By.linkText("Conditions of Use & Sale"));
		action.scrollToElement(condi).perform();
		
		System.out.println("The page title is : " + condi.getText());
		
		// Take Screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Destination location to save the screenshot
        File dest = new File("./snap/screenshot.png");

        // Save the screenshot
        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot taken and saved as screenshot.png");
        
        driver.close();
		
		
		
		
		

	}

}
