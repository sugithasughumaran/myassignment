package week2.day1;

public class reverseLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName = "TestLeaf";
		
		char[] charArray = companyName.toCharArray();
		
		System.out.println("Reverse word for TestLeaf is ");
		
		for (int i = charArray.length-1; i >= 0; i--) {
			
			System.out.println(charArray[i]);
		}
		

	}

}
