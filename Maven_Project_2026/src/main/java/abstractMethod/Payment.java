package abstractMethod;

public abstract class Payment {

	abstract void pay(double amt);
	
	void receipt() {
		
		System.out.println("Generate the receipt.");
	}
}
