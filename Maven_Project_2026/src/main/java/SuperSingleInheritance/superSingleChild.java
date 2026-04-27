package SuperSingleInheritance;

public class superSingleChild extends superSingleParent{

   int x = 20;
   
   superSingleChild(int x){
	   
	   super();
	 // this(); both this and super should called first so both cannot be called in the same constructor 
	   System.out.println("Child Constructor");
	   
   }
   
   superSingleChild(){
	   this(3); 
	   System.out.println("Child Constructor1");
	   
   }
   void show() {
	   
	   System.out.println("Parent variable = " + super.x);//call parent class variable
	   System.out.println("Child variable = " +x);
	   
	   super.display();//call parent class variable
   }
	
}
