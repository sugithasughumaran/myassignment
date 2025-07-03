package JavaChallenge;

public class squareRoot {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 666;
		int highest = number /2;
		
		if (number >= 0) {
		
		while(highest * highest > number) {
			
			highest = (highest + number / highest ) / 2;
		}
			System.out.println("Square root for " + number + " is " + highest);
	} else {
		System.out.println("Negative number is not supported for squareroot.");
	}

	}
	
}
