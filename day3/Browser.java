package week1.day3;

public class Browser {
	
	public String launchBrowser(String browserName) {
		
		System.out.println(browserName +" Browser launch successfully");
		return browserName;
		
	}
	
	void loadUrl() {
		
		System.out.println("Application url loaded successfully");
		
	}
	
	public static void main (String[] args) {
		
		Browser brow1 = new Browser();
		brow1.launchBrowser("Google");
		brow1.loadUrl();
		
	}

}
