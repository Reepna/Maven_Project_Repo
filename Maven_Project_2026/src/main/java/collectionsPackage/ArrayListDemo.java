package collectionsPackage;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<>(); //Generic Type
		
		color.add("indigo");
		color.add("blue");
		color.add("green");
		color.add("yellow");
		color.add("orange");
		color.add("red");
		System.out.println(color);
		color.add(0, "yellow"); // allows duplicates
		System.out.println(color);
		
		ArrayList<String> color1 = new ArrayList<>();
		color1.add("black");
		color1.add("white");
		color1.add("orange");
		//color.addAll(7, color1);
		//System.out.println(color);
		//contains all
		//color.containsAll(color1);
		//System.out.println(color);
		//retain all
		color.retainAll(color1);
		System.out.println("After retain - "+color);
	
		//remove all
		color.removeAll(color1);
		System.out.println(color);
		
		
	
		//get
		//System.out.println(color.get(3));
		//set
		//color.set(0, "violet");
		//System.out.println(color);
		//remove
		//color.remove(6);
		//System.out.println(color);
		//contains
		System.out.println(color.contains("red"));
		//size
		System.out.println(color.size());
		//clear
		color.clear();
		System.out.println(color);
	}

}
