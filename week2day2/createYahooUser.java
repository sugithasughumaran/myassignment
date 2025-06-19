package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createYahooUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/* Unable to do automation for facebook due to country policy and retrictions and replace with this page for automation.*/
		
		ChromeDriver driver;
		
		String expectedname = "sugitha sughumaran";
		String expectedemail = "sugitha.sughumaran2@gmail.com";
		
		 driver = new ChromeDriver();
		 driver.get("https://automationexercise.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@href='/login']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]")).sendKeys(expectedname);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys(expectedemail);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
		 Thread.sleep(1000);
		 
		 String message = driver.getTitle();
		 
	    if(message.contains("Automation Exercise - Signup")) {
			 
	    	 System.out.println("You have fulfill the first requirement");
			 
		} else {
			 
			 System.out.println("You did not fulfill the requirement");
        }
		 
		 WebElement id_gender2 = driver.findElement(By.id("id_gender2"));
	     id_gender2.click();
		 
         WebElement nameField = driver.findElement(By.id("name"));
         WebElement emailField = driver.findElement(By.id("email"));
		 
		 String actualName = nameField.getAttribute("value");
		 String actualEmail = emailField.getAttribute("value");
		 
		 if(actualName.equals(expectedname)) {
			 System.out.println("Verified UserName " +expectedname +"displayed.");
			 System.out.println("Verified Email " +expectedemail +"displayed.");
		 } else {
			 System.out.println("Both name and email address is not displayed");
		 }	 
		 
		 driver.findElement(By.id("password")).sendKeys("Ayam@321");
		 WebElement date = driver.findElement(By.id("days"));
			Select datedropdown = new Select(date);
			datedropdown.selectByIndex(18);
		 
	     WebElement mon = driver.findElement(By.id("months"));
			Select mondropdown = new Select(mon);
			mondropdown.selectByValue("5");
		
		 WebElement year = driver.findElement(By.id("years"));
			Select yeardropdown = new Select(year);
			yeardropdown.selectByVisibleText("1983");
			
		WebElement newsletter = driver.findElement(By.id("newsletter"));
		newsletter.click();
		
		WebElement option1 = driver.findElement(By.id("optin"));
		option1.click();
		
		driver.findElement(By.id("first_name")).sendKeys("Sugitha");
		driver.findElement(By.id("last_name")).sendKeys("Sughumaran");
		driver.findElement(By.id("company")).sendKeys("Cochlear");
		driver.findElement(By.id("address1")).sendKeys("1123, Jalan Hijayu 3D");
		driver.findElement(By.id("address2")).sendKeys("Taman Hijayu");
		
		WebElement country1 = driver.findElement(By.id("country"));
		Select countrydropdown = new Select(country1);
		countrydropdown.selectByValue("Singapore");
		
		driver.findElement(By.id("state")).sendKeys("Singapore");
		driver.findElement(By.id("city")).sendKeys("Singapore");
		driver.findElement(By.id("zipcode")).sendKeys("609799");
		driver.findElement(By.id("mobile_number")).sendKeys("61008901911");
		
		driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
		
		String acc = driver.getTitle();
		
		if (acc.contains("Account Created")) {
			
			System.out.println("Account successfully created.");
		} else {
			
			System.out.println("Something went wrong, please fill up again.");
			
		}
		
		
	}

}

