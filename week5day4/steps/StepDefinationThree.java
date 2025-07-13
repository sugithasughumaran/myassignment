package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import based.base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationThree extends base {
	
	@When("the user fill in the employee number")
	public void the_user_fill_in_the_employee_number() {
		driver.findElement(By.id("numberEmployees")).sendKeys("24");
	}
	@Then("the user click save button")
	public void the_user_click_save_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("verify unable to save")
	public void verify_unable_to_save() {
	    String message = driver.getTitle();
	    System.out.println("Create account not successful, it is still in the page " +message);
	}
	@Then("Error message is available")
	public void error_message_is_available() {
	    WebElement error1 = driver.findElement(By.xpath("//div[@class='errorMessageHeader']"));
	    String errorTitle = error1.getText();
	    if(errorTitle != null && !errorTitle.trim().isEmpty()) {
	    	System.out.println("These error message is showing: " +errorTitle);
	    } else {
	    	System.out.println("There is no error.");
	    }
	    
	}


}
