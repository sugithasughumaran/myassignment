package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dynamicParam extends datap {
     
	@DataProvider(name = "getdata")
	public String [][] fetchdata(){
		String [][] data = new String [3][1];
		
		data[0][0] = "Sugitha121";
		
		data[1][0] = "Sughumaran111";
		
		data[2][0] = "Thinakaran101";
		
		return data;
				
		}
	
	@Test(dataProvider="getdata")
	void testsalesforce(String name) throws InterruptedException {
	
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		// Find the created record
		String Name2 = driver.findElement(By.xpath("//div[contains(text(), '" + name + "')]")).getText();
		if(Name2.contains(name)) {
			System.out.println("Verified name is available.");
		} else {
			System.out.println("Name is not available.");
		}
	}



}
