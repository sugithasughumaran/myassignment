package week3.day1;

public interface Payments {
	
	void cashOnDelivery();
	void upiPayments();
	void cardPayments();
	void internetBanking();
	
	default void paymentsucess() {
		System.out.println("Various type of payments.");
	}
	

}
