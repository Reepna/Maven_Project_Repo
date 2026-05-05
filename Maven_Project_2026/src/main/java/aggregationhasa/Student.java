package aggregationhasa;

public class Student {
	
	String name;
	int id; 
	int age;
	CollegeAddress CollegeAdd;

	Student(String name, int id, int age, CollegeAddress CollegeAdd) {
		
		this.name = name;
		this.id = id;
		this.age = age;
		this.CollegeAdd = CollegeAdd;
		
	}
	
	void displayStudentDeatils()
	{
		System.out.println("name" + name);
		System.out.println("id" + id);
		System.out.println("age" + age);
		
		System.out.println("College Address" + CollegeAdd.city + " " + CollegeAdd.pin+ " "+ CollegeAdd.state);
		
	}
	public static void main(String[] args) {

		CollegeAddress ca1 = new CollegeAddress("Kochi", "Kerala", "670011", "Obsqura");
		Student s1 = new Student("Reepna", 1231,12,ca1);
		s1.displayStudentDeatils();
		
		CollegeAddress ca2 = new CollegeAddress("Kochi", "Kerala", "670011", "Obsqura");
		Student s2 = new Student("Sakshi", 1441,14,ca2);
		s2.displayStudentDeatils();
	}

}
