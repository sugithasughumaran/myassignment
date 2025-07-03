package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class secondLastNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// assigning array number to integer
		List<Integer> large;
		large = new ArrayList<Integer>();
		int[] number = {3,2,11,4,6,7};
		
		for (int numbers : number) {
			large.add(numbers);
		}
		
		Collections.sort(large);
		System.out.println("The list of number: " + large);
		System.out.println("The second largest number from the list: " + large.get(4));
	}

}
