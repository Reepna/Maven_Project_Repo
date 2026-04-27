package collectionsPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> s = new HashSet<>();
		
		s.add("Java");
		s.add("Python");
		s.add("Java");
		s.add("Javascript");
		s.add("Typescript");
		
		System.out.println(s);
		
		System.out.println("Using for each");
		for(String s2 :s) {
			System.out.println(s2);
		}
		
		
		
		
		
		System.out.println(s.size());
		
		System.out.println(s.contains("Sql"));
		
		System.out.println(s.remove("Java"));
		
		System.out.println(s);
		
Set<String> s1 = new HashSet<>();
		
		s1.add("Selenium");
		s1.add("Playwright");
		s1.add("Angular");
		s1.add("React");
		s1.add("Typescript");
		
		//Iterator
		System.out.println("This is Iterator");
		Iterator<String> it =  s1.iterator();
				
		while(it.hasNext()) {
					
			System.out.println(it.next());
		}
		
		System.out.println(s.retainAll(s1));
		System.out.println(s);
		
		System.out.println(s.addAll(s1));
		System.out.println(s);
		
		System.out.println(s.removeAll(s1));
		System.out.println(s);
		
		s.clear();
		System.out.println(s);
		
		
	}

}
