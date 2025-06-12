package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int version = 10;
		
		if(version > 0) {
			System.out.println(version +" Is a positive number");
		}else if(version < 0) {
			System.out.println(version +" Is a negative number");
		}else {
			System.out.println(version +" Is a 0");
		}
	}

}
