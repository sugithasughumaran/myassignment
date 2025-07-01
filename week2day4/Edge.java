package week2.day4;

public class Edge extends Chrome {
	
	 public void  takeSnap() {
	        System.out.println(browserName + " Takesnap shot.");
	    }

	    public void clearCookies()  {
	        System.out.println(browserName + " Cookies is cleared.");
	    }

	    public static void main(String[] args) {
			
	        Edge e = new Edge();
	    	
	    	e.browserName = "Edge";
	    	e.browserVersion = "1.2.3";
	    	e.clearCache();
	    	e.closeBrowser();
	    	e.openIncognito();
	    	e.openURL();
	    	e.navigateBack();
	    	e.takeSnap();
	    	e.clearCookies();
		}
}
