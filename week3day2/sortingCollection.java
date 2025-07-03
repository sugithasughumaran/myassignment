package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> wording;
		wording = new ArrayList<>();
		String[] words = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		// adding word to list
		for (String niceword : words) {
			wording.add(niceword);
		}
		
		// sort in reverse
		Collections.sort(wording);
		Collections.reverse(wording);
		System.out.println("The wording in reverse: ");
		System.out.println(wording);
		

	}

}
