package week1.day2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Please enter your upper limit for Fibonacci ");
		
		int index = Scanner.nextInt();
		
		int firstnumber = 0, Secondnumber = 1;
		
		while (firstnumber <= index) {
			
			System.out.println(firstnumber);
			
			int newnumber = (firstnumber + Secondnumber);
			
			firstnumber = Secondnumber;
			Secondnumber = newnumber;
		}
		
		
		

	}

}
