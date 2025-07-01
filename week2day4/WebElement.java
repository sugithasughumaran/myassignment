package week2.day4;

public class WebElement {
	
	String text = "Success";
	
	public void click() {
		
		System.out.println("Click this button.");
	}
	
	public void setText(String text) {
		
		System.out.println("String is printed " + text);
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		WebElement w = new WebElement();
		
		w.click();
		w.setText("Pear");

	}

}
