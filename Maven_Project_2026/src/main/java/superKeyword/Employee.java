package superKeyword;

public class Employee extends Org{
	int empid =21;
	Employee(){
		
		super();  //call Organization constructor
		System.out.println("Employee Constructor");
	
	}
	
	void displayEmployeeDetails() {
		
		super.displayOrgDetails(); //calls Organization method 
		System.out.println("Display employee method.");
		
	}

}
