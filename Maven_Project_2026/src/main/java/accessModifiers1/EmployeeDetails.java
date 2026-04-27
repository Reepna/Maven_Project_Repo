package accessModifiers1;

import accessModifiers.AccessModifierDemo;

public class EmployeeDetails extends AccessModifierDemo{
	
	void display() {
		
		System.out.println("My name is Reepna.");
		//System.out.println(num); //default variable is not accessible out side the package
		System.out.println(name);
		System.out.println(age);
		//System.out.println(id); //private variable is not accessible out side the package
		
		publicMethod();
		//defaultMethod(); //default method is not accessible out side the package
		protectedMethod();
		//privateMethod(); //private method is not accessible out side the package
	}
	
	
	public static void main(String[] args) {
		
		EmployeeDetails ed1 = new EmployeeDetails();
		ed1.display();
		
		
	}

}
