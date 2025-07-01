package week2.day4;

public class Browser {
	
	String browserName;
	String browserVersion;
	
	public void openURL() {
		
		System.out.println("Browser Name " +browserName);
		
	}
	
	public void closeBrowser() {
		
		System.out.println("Browser is closed " +browserName);
	}
	
	public void navigateBack() {
		System.out.println("Return back to " +browserName);
	}
	
	
	

}
