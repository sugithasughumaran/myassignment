package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Loginfacebook {

	public static void main(String[] args) throws InterruptedException {
		/*unable to use facebook as per requirement due to country based restriction replaced with Salesforce as per Instructor request*/
		
		EdgeDriver driver;

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("username")).sendKeys("testleaf.2023");
		driver.findElement(By.name("pw")).sendKeys("Tuna@321");
		driver.findElement(By.id("Login")).click();
		String pagetitle = driver.getTitle();
		
				if (pagetitle.toLowerCase().contains("login")) {
					
					System.out.println("Landed on a correct page.");
				} else {
					System.out.println("Testing not successful.");
			}
	}

}
