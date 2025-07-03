package week3.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class comparenumbers {
       public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    	   		// assigning array number to integer
				List<Integer> lista;
				lista = new ArrayList<Integer>();
				int[] ray1 = {3,2,11,4,6,7};
				// assigning array number
				List<Integer> listb;
				listb = new ArrayList<Integer>();
				int[] ray2 = {1,2,8,4,9,7};
				//adding number to list
				for (int num1 : ray1) {
					lista.add(num1);
				}
				
				for (int num2 : ray2) {
					listb.add(num2);
				}
				
				System.out.println("List of same number present in both collection.");
				// checking the numbers
				for (int abc = 0; abc < lista.size(); abc++) {
				 int current = lista.get(abc);
								
				if (listb.contains(current)) {
					System.out.println(current);
				}
					
					Thread.sleep(1000);
			}
				
				


}
}