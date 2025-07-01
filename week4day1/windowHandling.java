package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandling {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String parentpage = driver.getWindowHandle();
		System.out.println("Parent page id is " + driver.getTitle());
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		Set<String> currentwindow = driver.getWindowHandles();
	    List<String> childweb = new ArrayList<String>(currentwindow);
	    
		driver.switchTo().window(childweb.get(1));
			System.out.println("The flight page title: " + driver.getTitle());
 
	    driver.switchTo().window(parentpage);
	    driver.close();
	}

}
