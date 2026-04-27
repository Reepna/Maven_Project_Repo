package superKeyword;

public class Department extends Employee{

	Department(){
		
		super();  //call Employee constructor
		System.out.println("Dept Constructor");
	
	}
	
	void logistics() {
		
		//super.displayEmployeeDetails();
		System.out.println("Display Department method.");
	}

	void displayDepartmentDetails() {
		
		super.displayEmployeeDetails(); //calls Employee method 
		super.displayOrgDetails();  //calls Organization method 
		logistics(); //calls own class method
		System.out.println(super.empid);
		
		System.out.println("Display Department method.");
	}


}
