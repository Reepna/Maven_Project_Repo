package accessModifiers;

public class AccessModifierDemo{
	
	int num = 10;
	public String name = "Nakul";
	protected int age = 26;
	private int id = 123; //private variable is not visible outside the class 
	
	public void publicMethod()
	{
		System.out.println("This is a public method.");
		
	}
	
	void defaultMethod()
	{
		System.out.println("This is a default method.");
		
	}

	
	protected void protectedMethod()
	{
		System.out.println("This is a protected method.");
		
	}

	
	//private variable is not visible outside the class 
	private void privateMethod()
	{
		System.out.println("This is a private method.");
		
	}


}
