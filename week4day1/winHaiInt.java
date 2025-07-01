package week4day1;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class winHaiInt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		// accessing to the website
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// login to website
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		Set<String> childpage = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<>(childpage);
		
		driver.switchTo().window(windowsList.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		//driver.close();
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//input[@name='partyIdTo']/following-sibling::a")).click();
		// assigning new sub window
		
		Set<String> windowchild = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(windowchild);
		// switching to new window
		driver.switchTo().window(windowList.get(1));
		List<WebElement> contact = driver.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		if (contact.size() >= 2 && !contact.get(1).getText().isEmpty()) {
			System.out.println("Choosen contact details = " + contact.get(1).getText());
			contact.get(1).click();
		} else {
			System.out.println("You cant merge to the same contact.");
			System.out.println("There is not other contact available.");
		}
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentwindow);
		driver.quit();
	}

}
