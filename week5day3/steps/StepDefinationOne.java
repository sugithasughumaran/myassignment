package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationOne {
	ChromeDriver driver;
	
	@Given("the user establishes the portal")
	public void the_user_establishes_the_portal() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@Given("the user load the url")
	public void the_user_load_the_url() {
		driver.get("https://login.salesforce.com/");
	}
	@When("the user enter the username")
	public void the_user_enter_the_username() {
		driver.findElement(By.id("username")).sendKeys("bhuvanesh.moorthy@testleaf.com");
	}
	@When("the user enter the password")
	public void the_user_enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("Leaf@2025");
	}
	@When("the user click the login button")
	public void the_user_click_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}
	@Then("the user navigate to the SalesForce Home page")
	public void the_user_navigate_to_the_sales_force_home_page() {
	  System.out.println(driver.getTitle());
	}
	@When("the user click the App Launcher Icon")
	public void the_user_click_the_app_launcher_icon() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@When("the user click View All")
	public void the_user_click_view_all() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
        Thread.sleep(2000);
	}
	@Then("the user scroll down the page")
	public void the_user_scroll_down_the_page() throws InterruptedException {
	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
          WebElement accounts = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//p[text()='Accounts']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accounts);
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", accounts);
        Thread.sleep(4000);
	}
	@When("the user click the Accounts")
	public void the_user_click_the_accounts() {
	    driver.findElement(By.xpath("//p[text()='Accounts']")).click();
	}
	@Then("the user click the New Button")
	public void the_user_click_the_new_button() {
	    driver.findElement(By.xpath("//a[@title='New']")).click();
	}
	@When("the user enter the account name")
	public void the_user_enter_the_account_name() {
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Sugitha");
	}
	@When("the user select the ownership")
	public void the_user_select_the_ownership() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement scroll = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
	   // scroll.click();
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
	    Actions ac = new Actions(driver);
	    ac.moveToElement(scroll).click().perform();
	    WebElement publicOption = driver.findElement(By.xpath("//span[@title='Public']"));
	    publicOption.click();
	    Thread.sleep(1000);
	}
	@When("the user clicks the save button")
	public void the_user_clicks_the_save_button() {
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	@Then("the user verify the account name")
	public void the_user_verify_the_account_name() {
	   WebElement accountname = driver.findElement(By.xpath("//slot[@name='primaryField']"));
	   String name = accountname.getText();
	   System.out.println("The" + name + "account is created.");
	}
	@Then("the browser closed")
	public void the_browser_closed() {
	  driver.close();
	}	
	
}

