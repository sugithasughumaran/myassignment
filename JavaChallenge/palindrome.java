package JavaChallenge;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "Level";
		String reverse = "";
		
		for (int i = original.length()-1; i >= 0;  i--) {
			reverse += original.charAt(i);
		}
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("Given word was : " + original + ". It is Palindrome word.");
		}else {
			System.out.println("It is not Palindrome word.");
		}

	}

}
