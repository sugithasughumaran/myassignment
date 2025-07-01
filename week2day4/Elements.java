package week2.day4;

public class Elements extends Button {
	
	public static void main(String[] args) {
		
		//Button
		Button b = new Button();
		b.submit();
		
		//RadioButton
		RadioButton r = new RadioButton();
		r.selectRadioButton();
		
		//CheckBoxButton
		CheckBoxButton c = new CheckBoxButton();
		c.clickCheckButton();
		
		//TextField
		TextField t = new TextField();
		t.getText();
		
		WebElement w = new WebElement();
		w.click();
		w.setText("success");
		
		
		
	}

}
