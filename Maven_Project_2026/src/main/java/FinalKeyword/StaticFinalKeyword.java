package FinalKeyword;

public class StaticFinalKeyword {
	
	int id = 321;
	static final String clg = "CEM";
	
	StaticFinalKeyword(int id){
		
		this.id = id;
	}
	
	void display() {
		
		System.out.println(clg + " "+ id);
	}

	public static void main(String[] args) {

		StaticFinalKeyword s1 = new StaticFinalKeyword(21423);
		StaticFinalKeyword s2 = new StaticFinalKeyword(4235);
		//s1.clg = "KVK"; this is final static variable so cannot be changed 
		s1.display();
		s2.display();
		
	}

}
