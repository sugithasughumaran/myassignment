package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Declare and assign the input number
		        int input = 12345;
		        int originalInput = input;  // Store the original number for comparison
		        int output = 0;             // To store the reversed number

		        // Use a for loop to reverse the digits
		        for (int i = input; i > 0; i = i / 10) {
		            int rem = i % 10;               // Get the last digit
		            output = (output * 10) + rem;   // Append digit to output
		        }

		        // Compare the original input with the reversed number
		        if (originalInput == output) {
		            System.out.println("It is a Palindrome");
		        } else {
		            System.out.println("It is not a Palindrome");
		        }

	}

}
