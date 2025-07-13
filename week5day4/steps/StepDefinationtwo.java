package steps;

import org.openqa.selenium.By;

import based.base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationtwo extends base {
	@When("the user click on Account tab")
	public void the_user_click_on_account_tab() {
		driver.findElement(By.linkText("Accounts")).click();
	}
	@When("the user click on Create Account link")
	public void the_user_click_on_create_account_link() {
		driver.findElement(By.linkText("Create Account")).click();
	}
	@Then("Create Account page is loaded")
	public void Create_Account_page_is_loaded() {
	  String title1 =  driver.getTitle();
	    System.out.println("Page is loaded: " +title1);
	}
	
	@When("the user fill in the Account name")
	public void the_user_fill_in_the_account_name() {
		driver.findElement(By.className("inputBox")).sendKeys("Sugitha332");
	}
	@When("the user fill in the description")
	public void the_user_fill_in_the_description() {
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	}
	@When("the user fill in the office site name")
	public void the_user_fill_in_the_office_site_name() {
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
	}
	@Then("the user clicks save button")
	public void the_user_clicks_saveEdit_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("verify the new Lead is created")
	public void verify_the_new_lead_is_created() {
		String title = driver.getTitle();
		
		if(title.contains("Account Details")) {
			System.out.println("Account Created, successfully.");
			
		} else {
			System.out.println("Account is not created.");
		}
	}


}
