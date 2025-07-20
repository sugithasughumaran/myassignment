package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import based.base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class weeksixdayonesftwo extends base {
	
	@When("the user click the App Launcher")
	public void the_user_click_the_app_launcher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@Then("the user click View All text link")
	public void the_user_click_view_all_text_link() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
        Thread.sleep(4000);
	}
	@Then("the user click Sale icon")
	public void the_user_click_sale_icon() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement sales = wait.until(ExpectedConditions.visibilityOfElementLocated(
          By.xpath("//p[text()='Sales']")));
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sales);
      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sales);
      Thread.sleep(6000);
	}
	@When("the sales page is loaded")
	public void the_sales_page_is_loaded() {
	    String page = driver.getTitle();
	    System.out.println("We have loaded to page " + page );
	}
	@Then("the user click Account dropdown button")
	public void the_user_click_account_dropdown_button() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		    // Wait for the element to be visible and clickable
		    WebElement accountLink = wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//a[@href='/lightning/o/Account/home']")));

		    // Scroll into view and click using JS (if needed)
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accountLink);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", accountLink);

		    Thread.sleep(3000); // Allow time for page to load
	}
	@Then("the user selected New Account")
	public void the_user_selected_new_account() throws InterruptedException {
			driver.findElement(By.xpath("//div[@title='New']")).click();
			Thread.sleep(3000);
	}
	@When("the New account page is loaded")
	public void the_new_account_page_is_loaded() {
	    String newaccount = driver.getTitle();
	    System.out.println("We are at new page : " + newaccount);
	}
	@Then("the user enter Account name (.*)$")
	public void the_user_enter_account_name_thanu(String aname) {
             driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(aname);
	}
	@Then("the user Select (.*)$")
	public void the_user_select_public(String ownership) {
		 WebElement owner = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));

		    // Scroll into view
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", owner);

		    // Click the Ownership dropdown
		    Actions ac = new Actions(driver);
		    ac.moveToElement(owner).click().perform();

		    // Wait and select the option using dynamic XPath
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//span[@title='" + ownership + "']")));
		    option.click();
		}
	@Then("the user click Save button")
	public void the_user_click_save_button() {
		  driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	@Then("the user verify the newly created (.*)$")
	public void the_user_verify_the_newly_created_thanu(String aname) {
		 // Wait for the name to appear
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement accountNameElement = wait.until(ExpectedConditions
	        .visibilityOfElementLocated(By.xpath("//slot[@name='primaryField']//lightning-formatted-text")));

	    String actualName = accountNameElement.getText().trim();
	    System.out.println("Expected: " + aname + ", Actual: " + actualName);

	    // Assert
	    Assert.assertEquals(actualName, aname, "Account name mismatch!");
	   
	}

}
