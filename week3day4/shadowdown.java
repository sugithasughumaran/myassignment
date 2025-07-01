package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class shadowdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver;
		
		driver = new ChromeDriver();
	
		driver.get("https://dev217936.service-now.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("ulJ8fB5Cd!/M");
		driver.findElement(By.id("sysverb_login")).click();
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		Thread.sleep(5000);
		WebElement ifra = shadow.findElementByXPath("//iframe[@id='gsft_main']");;
		driver.switchTo().frame(ifra);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		Thread.sleep(5000);
		shadow.findElementByXPath("//strong[text()='Apple iPhone 13 pro']/ancestor::a").click();
		Thread.sleep(5000);
		WebElement radiobutton = shadow.findElementByXPath("//label[contains(text(),'Yes')]");
		radiobutton.click();
		Thread.sleep(3000);
		shadow.findElementByXPath("//input[@id='IO:4afecf4e9747011021983d1e6253af34']").sendKeys("99");
		WebElement unlimi = shadow.findElementByXPath("//select[@name='IO:ff1f478e9747011021983d1e6253af68']");
		Select unlimi1 = new Select(unlimi);
		unlimi1.selectByValue("unlimited");
		Thread.sleep(3000);
		shadow.findElementByXPath("label[text()='Sierra Blue']").click();
		shadow.findElementByXPath("label[text()='512 GB [add $300.00]']").click();
		shadow.findElementByXPath("//button[@id='oi_order_now_button']").click();
		WebElement message = driver.findElement(By.xpath("//span[contains(text(),'Thank you, your request has been submitted')]"));
		String message1 = message.getText();
		WebElement reqnumber = driver.findElement(By.id("requesturl"));
		String requnumber1 = reqnumber.getText();
			System.out.println(message1);
			System.out.println("Your order reference number: " + requnumber1);
		
		driver.quit();
	}

}
