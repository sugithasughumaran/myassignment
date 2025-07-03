package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

     public class missingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> missing;
		missing = new ArrayList<Integer>();
		int[] number = {1,2,3,4,10,6,8};
		
		// adding number to list
		for (int numbers : number) {
			missing.add(numbers);
		}
		
		// do sorting
		Collections.sort(missing);
		System.out.println("The list of number: " + missing);
		
		// do calculation for the missing number
		for (int i = 0; i < missing.size() - 1; i++) {
			
			int current = missing.get(i);
			int next = missing.get(i + 1);
			
			if ( next != current + 1 ) {
				for (int real = current + 1; real < next; real++) {
					System.out.println("The missing number are: " + real);
				}
			}
			
		}
			
		
	}

}
