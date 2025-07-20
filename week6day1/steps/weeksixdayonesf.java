package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import based.base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class weeksixdayonesf extends base {
	
	String Phonenum;
	
	@When("the user click the App Launcher")
	public void the_user_click_the_app_launcher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@When("the user click View All link text")
	public void the_user_click_view_all_link_text() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
        Thread.sleep(4000);
	}
	@When("the user scrolled to Accounts")
	public void the_user_scrolled_to_accounts() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
         WebElement accounts = wait.until(ExpectedConditions.visibilityOfElementLocated(
           By.xpath("//p[text()='Accounts']")));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accounts);
       //((JavascriptExecutor) driver).executeScript("arguments[0].click();", accounts);
       Thread.sleep(5000);
	}
	@When("the user click Accounts link text")
	public void the_user_click_accounts_link_text() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Accounts']")).click();
		 Thread.sleep(4000);
	}
	@Then("the user search unique account name")
	public void the_user_search_unique_account_name() {
		driver.findElement(By.xpath("(//a[@title='Sugitha'])[1]")).click();
	}
	@When("the user click dropdown icon next to New Note")
	public void the_user_click_dropdown_icon_next_to_new_note() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//li[@class='slds-dropdown-trigger slds-dropdown-trigger_click slds-button_last overflow']"));
		dropdown.click();
		Thread.sleep(2000);
	}
	@Then("the user click Edit text link")
	public void the_user_click_edit_text_link() throws InterruptedException {
		driver.findElement(By.xpath("//lightning-menu-item[@data-target-selection-name='sfdc:StandardButton.Account.Edit']//span[text()='Edit']")).click();
		Thread.sleep(2000);
	}
	@Then("the user Set Type to Technology Partner")
	public void the_user_set_type_to_technology_partner() throws InterruptedException {
		WebElement scroll = driver.findElement(By.xpath("//button[@aria-label='Type']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
	    Actions ac = new Actions(driver);
	    ac.moveToElement(scroll).click().perform();
	    WebElement publicOption = driver.findElement(By.xpath("//span[@title='Technology Partner']"));
	    publicOption.click();
	    Thread.sleep(2000);
	}
	@Then("the user Set Industry to Healthcare")
	public void the_user_set_industry_to_healthcare() throws InterruptedException {
	    WebElement scroll = driver.findElement(By.xpath("//button[@aria-label='Industry']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
	    Actions ac = new Actions(driver);
	    ac.moveToElement(scroll).click().perform();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement healthcareOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")));
	    healthcareOption.click();
	    Thread.sleep(4000);
	}
	@Then("the user key in the Billing address to {string}")
	public void the_user_key_in_the_billing_address_to(String address) {
	    WebElement billingadd = driver.findElement(By.xpath("//label[(text()='Billing Street')]/following::textarea"));
	    billingadd.clear();
	    billingadd.sendKeys(address);
	}
	@Then("the user key in the Shipping address to {string}")
	public void the_user_key_in_the_shipping_address_to(String shipping) {
		WebElement shippingaddress = driver.findElement(By.xpath("//label[(text()='Shipping Street')]/following::textarea"));
		shippingaddress.clear();
		shippingaddress.sendKeys(shipping);
	}
	@When("the user Set Customer priority to Low")
	public void the_user_set_customer_priority_to_low() {
		WebElement priority = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
		driver.executeScript("arguments[0].click()", priority);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click(); 
	}
	@Then("the user Set SLA Silver")
	public void the_user_set_silver() {
	   WebElement sla = driver.findElement(By.xpath("//button[@aria-label='SLA']"));
	   driver.executeScript("arguments[0].click()", sla);
	   driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
	}
	@Then("the user Set Active to No")
	public void the_user_set_active_to_no() {
	    WebElement active = driver.findElement(By.xpath("//button[@aria-label='Active']"));
	    driver.executeScript("arguments[0].click()", active);
	    driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	}
	@When("the user enter phone no {string}")
	public void the_user_enter_phone_no(String phone) {
	   driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys(phone);
	   Phonenum = phone;
	}
@Then("the user Set Upsell opportunity to No")
public void the_user_set_upsell_opportunity_to_no() {
	WebElement upsell = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
	  driver.executeScript("arguments[0].click()", upsell);
	  driver.findElement(By.xpath("//span[@title='No']")).click();
}
//	@Then("the user Set Upsell opportunity to {string}")
	//public void the_user_set_upsell_opportunity_to(String string) {
	//  WebElement upsell = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
	  //driver.executeScript("arguments[0].click()", upsell);
	 // driver.findElement(By.xpath("//span[@title='No']")).click();
	//}
	@When("the user click Save button")
	public void the_user_click_save_button() {
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	@When("verify the Phone number entered")
	public void verify_the_phone_number_entered() {
	WebElement phon = driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]"));
	String phonee = phon.getText();
	if(Phonenum.equals(phonee)) {
		System.out.println("Phone number is verified.");
	} else {
		System.out.println("Phone number does not match with the changes value.");
	}
	
	
	}


}
