package week4.day3;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FindMissingElement {
    @Test
	public void findmiss() {
		// TODO Auto-generated method stub
	
		int arr[] = {1,4,3,2,6,8,7};
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length - 1; i++) {
			
		if(arr[i + 1] != arr[i] + 1) {
			
			System.out.println("The missing number is : " +(arr[i]+1));
			break;
		}
			
			
			
		}

	}

}
