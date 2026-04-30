package collectionsPackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("dragonfruit");
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("mango");
		fruits.add("grapes");
		
		Collections.sort(fruits);
		Collections.sort(fruits, Collections.reverseOrder());
		
		System.out.println("using for loop");
		for(int i=0; i<fruits.size();i++) {
			
			System.out.println(fruits.get(i));
			
		}
		
		System.out.println("Using for each");
		for(String frts :fruits) {
			System.out.println(frts);
		}
		
		
		//Integer with Integer wrapper class
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		//list1.add("Hello");
		System.out.println(list1);
	/*	
		ArrayList list = new ArrayList();
		list.add(23);
		list.add("Hello");
		list.add(2.3f);
		list.add(true);
		list.add(23.43534);
		System.out.println(list);
		
		for(Object obj:list) {
			
			System.out.println(obj);
			
		}
			*/
	}

}
