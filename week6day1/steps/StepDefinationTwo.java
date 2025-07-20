package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import based.week6d1base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationTwo extends week6d1base{

	@Then("the user click Account tab")
	public void the_user_click_account_tab() {
		driver.findElement(By.linkText("Accounts")).click();
	}
	@Then("the uesr click the Create Account")
	public void the_uesr_click_the_create_account() {
		driver.findElement(By.linkText("Create Account")).click();
	}
	@When("the user fill in the Account Name (.*)$")
	public void the_user_fill_in_the_account_name_fname(String fname) {
		driver.findElement(By.className("inputBox")).sendKeys(fname);
	}
	@When("the user fill in the Description (.*)$")
	public void the_user_fill_in_the_description_desc(String desc) {
		driver.findElement(By.name("description")).sendKeys(desc);
	}
	@When("the user fill in the Email Address (.*)$")
	public void the_user_fill_in_the_email_address_email_address(String email) {
	    driver.findElement(By.xpath("//input[@id='primaryEmail']")).sendKeys(email);
	}
	@When("the user fill in the Phone Number (.*)$")
	public void the_user_fill_in_the_phone_number_phone(String Phone) {
		driver.findElement(By.xpath("//input[@id='primaryPhoneNumber']")).sendKeys(Phone);
	}
	@Then("the user click the Create Account button")
	public void the_user_click_the_create_account_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}
}
