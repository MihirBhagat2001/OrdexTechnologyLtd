package ExampleCollection;

import java.util.TreeSet;

public class DemoTree2 {

	public static void main(String[] args) {
		
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("C");
		ts1.add("Z");		
		ts1.add("F");
		ts1.add("A");
		ts1.add("G");
		
		
		System.out.println("First : "+ ts1.first());
		System.out.println("Last : "+ ts1.last());
		System.out.println("Lower : "+ts1.lower(ts1.last()));	//Returns the lower element in the Set than the argument..		
		System.out.println("TailSet : "+ts1.tailSet("F")); 
		System.out.println("Subset : "+ts1.subSet("C", "Z"));
		System.out.println("Descending : "+ts1.descendingSet());
		
		System.out.println("TreeSet : "+ts1);

	}

}
