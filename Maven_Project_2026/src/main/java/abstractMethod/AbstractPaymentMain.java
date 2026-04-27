package abstractMethod;

public class AbstractPaymentMain {

	public static void main(String[] args) {

		
		Payment p1 = new CreditCard();
		p1.receipt();
		p1.pay(3223);
		
		
		Payment p2 = new UpiPayment();
		p2.receipt();
		p2.pay(14253);
	}

}
