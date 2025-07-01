package week2.day4;

public class Chrome extends Browser {
	   public void openIncognito() {
	        System.out.println(browserName + " is opening in Incognito Mode.");
	    }

	    public void clearCache() {
	        System.out.println(browserName + " is clearing cache.");
	    }
	    
	    public static void main(String[] args) {
			
	    	Chrome c= new Chrome();
	    	
	    	c.browserName = "Chrome";
	    	c.browserVersion = "1.2.2";
	    	c.clearCache();
	    	c.closeBrowser();
	    	c.openIncognito();
	    	c.openURL();
	    	c.navigateBack();
	    	
		}

}
