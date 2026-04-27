package accessModifiers1;

import accessModifiers.AccessModifierDemo;

public class AccessModifierDemo1 {

	public static void main(String[] args) {
		
		AccessModifierDemo am1 = new AccessModifierDemo();
		System.out.println(am1.name);
		//System.out.println(am1.age); //protected is not visible 
		//System.out.println(am1.id); //private variable is not visible outside the class 
		
		am1.publicMethod();
		//am1.defaultMethod(); // default method is not visible 
		//am1.protectedMethod();//protected method is not visible
		//am1.privateMethod();//private variable is not visible outside the class 
		
	}

}
