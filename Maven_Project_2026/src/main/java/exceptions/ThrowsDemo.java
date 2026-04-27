package exceptions;

public class ThrowsDemo {

	static void checkBalance(int balance) 
	{
		
		if(balance<=1000) 
		{
			
			throw new ArithmeticException("balance is not enough");
			
		}
		System.out.println("Welcome");
	}
	
	
	public static void main(String[] args) {

		try {
		ThrowsDemo.checkBalance(500);
		
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
	}

}
