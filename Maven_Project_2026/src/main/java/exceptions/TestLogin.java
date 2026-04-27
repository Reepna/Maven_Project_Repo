package exceptions;

public class TestLogin {

	public static void main(String[] args) {

		System.out.println("Open Browser");
		System.out.println("Enter Username:");
		System.out.println("Enter Password");
		
		try {
		String button =  null;  //"Hello";
		System.out.println(button.length());
		}
		catch(Exception e) {
			
			System.out.println("Cannot invoke \"String.length()\" since \"button\" is null");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Close the browser");
		}
	}

}
