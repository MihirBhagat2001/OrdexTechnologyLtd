package ExampleCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(87.4);
		a1.add(76.6);
		a1.add(65.3);
		a1.add(34.9);
		a1.add(45.7);
		
		System.out.println("Using for loop");
		for(int i2 = 0; i2 < a1.size();i2++) {
			System.out.println((i2+1)+". "+a1.get(i2)); //count is not incrementing..
		}
		
		TreeSet<Double> ts1 = new TreeSet<Double>(a1);	//Creating object of TreeSet and passing obj of arraylist as constructor argument.
		Iterator<Double> i  = ts1.iterator();
		
		System.out.println("Using while loop"); 
		while(i.hasNext()) {
			int count = 0;
			System.out.println((count+1)+". "+i.next());  //count is not incrementing..
		}
		
		System.out.println("Using Advance for loop");
		for(Double s : ts1) {
			int count = 0;
			System.out.println((count+1)+". "+s); //count is not incrementing..
		}
		
		System.out.println("Checking that Arraylist elements are present in TreeSet : "+ts1.containsAll(a1));
		System.out.println("Checking that is Empty : "+ts1.isEmpty());	//true means empty/False means occupied.
		System.out.println("Size of TreeSet : "+ts1.size());
		
		Spliterator<Double> sp1 = ts1.spliterator();	// Only supported in Java 1.8 or up!!
//		System.out.println("Printing TreeSet Using Spliterator");
//		sp1.forEachRemaining(System.out::println);
		
		Spliterator<Double> sp2 = sp1.trySplit(); //Here sp1 & sp2 are assigned half-half elements of TreeSet to achieve parallel programming.
		System.out.println("Printing elements of sp1");
		sp1.forEachRemaining(System.out::println);
		
		System.out.println("Printing elements of sp2");
		sp2.forEachRemaining(System.out::println);
		
		System.out.println("Printing First element of the TreeSet : "+ts1.pollFirst()); // Returns and delete the First element in the TreeSet
		System.out.println("Printing Last element of the TreeSet : "+ts1.pollLast());	// Returns and delete the last element in the TreeSet
		System.out.println("Printing the ceiling element of TreeSet : "+ts1.ceiling(50.7)); //Return's the greatest closest element in the TreeSet 
																							// that come after 50.7 which is 65.3 
		System.out.println("Printing the floor element of the specified element of the TreeSet :"+ts1.floor(50.7));
		System.out.println(ts1);
		ts1.clear(); // This method will clear the TreeSet.
		System.out.println("Size of TreeSet : "+ts1.size());
		
		
	}
}
