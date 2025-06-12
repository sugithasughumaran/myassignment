package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte number = 13;
		
		for (int num = 1; num <= number; num++) {
			boolean isPrime = true;
			
			if(num <= 1) {
				isPrime = false;
			}else {
				for (int i = 2; i <= Math.sqrt(num); i++) {
					if(num % i == 0) {
						isPrime = false;
						break;
						
					}
				}
					
			}
			
			if(isPrime) {
				System.out.print(num +" is a prime number.");
			}else {
				System.out.print(num +" is not a prime number.");
			}
			
			System.out.println();
		}
		
	}
	
}