package exceptions;

public class Abc {

	public static void main(String[] args) {
        try {
		int a = 1;
		int b = 10;
		int res = a/b;
		int arr[] = {10,20,30};
		
		System.out.println(arr[2]);
		System.out.println(res);
        }
        catch(ArithmeticException e) {
        	
        	System.out.println("Please enter a number for division");
        }
		catch(ArrayIndexOutOfBoundsException a) {
			
			System.out.println(a.getMessage());
		}
        finally
        {
        	System.out.println("continue program");
        }
	}

}
