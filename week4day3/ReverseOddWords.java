package week4.day3;

import org.testng.annotations.Test;

public class ReverseOddWords {
	@Test
	public void rev() {
        // Input string
        String test = "I am a software tester";

        // Split the string into words
        String[] words = test.split(" ");

        // Loop through each word by index
        for (int i = 0; i < words.length; i++) {

            // Check for odd index (1, 3, 5, ...)
            if (i % 2 != 0) {
                // Convert word to char array and reverse it
                char[] chars = words[i].toCharArray();
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }
            } else {
                // Even index — print word as-is
                System.out.print(words[i]);
            }

            // Add space after each word
            System.out.print(" ");
        }
    }

}
