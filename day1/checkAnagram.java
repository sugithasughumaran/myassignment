package week2.day1;

import java.util.Arrays;

public class checkAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String text1 = "stops";
	String text2 = "potss";
	
	if (text1.length() != text2.length()) {
		
				System.out.println("The length is mismatching, string is not anagrams");
				
	} else {
	
	char[] chararrays1 = text1.toCharArray();
	char[] chararrays2 = text2.toCharArray();
			
		Arrays.sort(chararrays1);
		Arrays.sort(chararrays2);
		
		if(Arrays.equals(chararrays1, chararrays2)) {
			System.out.println("This is anagrams.");
			
			
		}else {
			System.out.println("This is not an anagrams.");
		}
		

	}

}
}
