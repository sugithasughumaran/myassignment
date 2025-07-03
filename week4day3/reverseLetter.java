package week4.day3;

import org.testng.annotations.Test;

public class reverseLetter {
	@Test
	public void revLet() {
		// TODO Auto-generated method stub
		
		String companyName = "TestLeaf";
		
		char[] charArray = companyName.toCharArray();
		
		System.out.println("Reverse word for TestLeaf is ");
		
		for (int i = charArray.length-1; i >= 0; i--) {
			
			System.out.println(charArray[i]);
		}
		

	}

}
