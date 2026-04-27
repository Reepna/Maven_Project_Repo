package accessModifiers;

public class AccessModifierDemoMain {

	public static void main(String[] args) {

		
		AccessModifierDemo am1 = new AccessModifierDemo();
		System.out.println(am1.name);
		System.out.println(am1.age);
		//System.out.println(am1.id); //private variable is not visible outside the class 
		
		am1.publicMethod();
		am1.defaultMethod();
		am1.protectedMethod();
		//am1.privateMethod();//private variable is not visible outside the class 
		
	}

}
