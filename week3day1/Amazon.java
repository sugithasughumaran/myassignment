package week3.day1;

public class Amazon extends CanaraBank {
	

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Payment details are:");
	}
    @Override
	public void upiPayments() {
		System.out.println("Payment by UPI.");
	}
	
    @Override
	public void cardPayments() {
		System.out.println("Payment via card.");
	}
	@Override
	public void cashOnDelivery() {
		System.out.println("Payment via cash on deliver");
	}
	
	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("We allow Internet Banking.");
	}
	

	public static void main(String[] args) {
	
	Amazon zon = new Amazon();
	
	zon.internetBanking();
	zon.cardPayments();
	zon.cashOnDelivery();
	zon.upiPayments();
	zon.recordPaymentDetails();
	
 }
}


