package exceptions;

public class TestLoginThrow {
	
	static void clickLoginButton(boolean btnFound) throws Exception
	
	{
		
		if(!btnFound) 
		
		{
			
			throw new Exception("Login button not found");
		}
		
		else {
			
			System.out.println("Click login button");
		}
	}
	
	public static void main(String[] args) {
		
		
		try {
		clickLoginButton(false);
		
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Test Completed");
		}
	}

}
