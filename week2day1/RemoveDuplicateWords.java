package week2.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn Java basics as part of java sessions in java week1";

        // Split the text into an array of words
        String[] words = text.split(" ");

        int count = 0; // To track duplicate words

        // Loop through each word in the array
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // Check for duplicates using equalsIgnoreCase
                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = "";  // Replace duplicate with empty string
                    count++;
                }
            }
        }

        // Print the modified string (if duplicates were found)
        if (count > 0) {
            System.out.print("Modified sentence: ");
            for (int i = 0; i < words.length; i++) {
                System.out.print(words[i] + " ");
            }
        } else {
            System.out.println("No duplicates found.");
        }
    }

	}
