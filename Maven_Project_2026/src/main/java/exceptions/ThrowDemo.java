package exceptions;

public class ThrowDemo {

	public static void main(String[] args) {
		int balance = 500;
		if(balance<=1000) {
			
			throw new ArithmeticException("balance is not enough");
			
		}
		
		System.out.println("Welcome");

	}

}
