package week2.day1;

public class changeOddindextoupper {
		
	    public static void main(String[] args) {

	        // Input string
	        String test = "changeme";

	        // Convert string to character array
	        char[] charArray = test.toCharArray();

	        // Loop from end to start
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            // Check if index is odd
	            if (i % 2 != 0) {
	                // Convert character to uppercase at odd index
	                charArray[i] = Character.toUpperCase(charArray[i]);
	            }
	        }

	        // Print the result
	        System.out.print("Result: ");
	        for (char ch : charArray) {
	            System.out.print(ch);
	        }
	}
}
