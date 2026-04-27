package SuperSingleInheritance;

public class superSingleParent {
	
	int x = 10;
	
	superSingleParent()
	{
		this(2);
		System.out.println("Parent Constructor");
	}
	
	superSingleParent(int x)
	{
		   
		this.x = x;
	}
	
	
	void display() 
	{
		
		System.out.println("Parent Method");
	}

}
