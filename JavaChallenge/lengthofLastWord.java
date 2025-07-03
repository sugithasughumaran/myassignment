package JavaChallenge;

public class lengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fullsentences = "Welcome to Seremban waterfall.";
		//removing unwanted space or letters
		fullsentences = fullsentences.trim().replaceAll("[^a-zA-Z0-9 ]", "");
		
		//splitting the word
		String[] word = fullsentences.split(" ");
		
		// last word assigning 
		String finalword = word[word.length - 1];
		
	
		// printing
		System.out.println("The word given: " + fullsentences);
		System.out.println("The last word: " + finalword);
		System.out.println("The total characters: " + finalword.length());
		

	}

}
