package week2.day4;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		
		System.out.println("User name entered");
		
	}
	
	public void enterPassword() {
		System.out.println("Password is entered.");
	}
	
	public static void main(String[] args) {
		LoginTestData ld= new LoginTestData();
		
	
		ld.enterCredentials();
		ld.enterPassword();
		ld.enterUsername();
		ld.navigateToHomePage();
	}
}
