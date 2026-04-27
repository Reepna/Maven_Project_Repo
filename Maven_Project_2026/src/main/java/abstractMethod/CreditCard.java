package abstractMethod;

public class CreditCard extends Payment{

	@Override
	void pay(double amt) {

		System.out.println("Credit card amount is - " + amt);
	}

}
