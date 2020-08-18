package ExampleCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class DemoHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs1 = new HashSet<Integer>(10);
		
		try {
			hs1.add(12);
			hs1.add(13);
			hs1.add(14);
			hs1.add(15);
		//	hs1.add(12);
			hs1.add(16);
			hs1.add(17);
			hs1.add(18);
			hs1.add(null);
			hs1.add(null);
		}
		catch(Exception e) {
			System.out.println("Duplicate value inserted");
		}
		Iterator<Integer> i = hs1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Initial Capacity of HashSet : "+hs1.size());
		
		System.out.println("Checking that is contains 15 value or not : "+hs1.contains(15));
		Spliterator<Integer> sp1 = hs1.spliterator();
		sp1.forEachRemaining(System.out::println);
		
		//Creating second Hashset object and cloning it with the first object..
		HashSet<Integer> hs2 =  (HashSet<Integer>) hs1.clone(); 
		System.out.println("Printing Second HashSet");
		Spliterator<Integer> sp2 = hs2.spliterator();
		sp2.forEachRemaining(System.out::println);
		
	}

}
