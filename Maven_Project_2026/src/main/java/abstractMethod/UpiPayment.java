package abstractMethod;

public class UpiPayment extends Payment{

	@Override
	void pay(double amt) {

		
		System.out.println("Upi amount is - " + amt);
	}

}
