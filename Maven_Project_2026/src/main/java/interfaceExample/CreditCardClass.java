package interfaceExample;

public class CreditCardClass implements PaymentInterface{

	@Override
	public void payInterface(double amt) {

		
		System.out.println("Credit card payment amount is " + amt);
	}
	
	
	public static void main(String[] args) {
		
		PaymentInterface pi = new CreditCardClass();
		pi.payInterface(3243);
		
	}

}
