package polymorphism;

public class MethOverMainClass {

	public static void main(String[] args) {
		
		MethOverClass1 a = new MethOverClass1();
		a.method1();
		
		MethOverClass2 b = new MethOverClass2();
		b.method1();
		
		MethOverClass3 c = new MethOverClass3();
	    c.method1();

	}

}
