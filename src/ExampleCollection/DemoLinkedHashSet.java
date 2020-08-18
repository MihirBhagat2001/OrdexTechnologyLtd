package ExampleCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
		lhs1. add("Mihir");
		lhs1.add("Kartik");
		lhs1.add("Nidhi");
		lhs1.add("kavita");
		lhs1.add(null);
		lhs1.add(null);
		
		System.out.println("Printing linkedhashset using Iterator");
		Iterator<String> i = lhs1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Printing linkedhashset usinng spliterator");
		Spliterator<String> sp1 = lhs1.spliterator();
		sp1.forEachRemaining(System.out::println);
		
		System.out.println("Printing LinkedHashSet using foreach");
		lhs1.forEach(System.out::println);
		System.out.println("Size of linkedhashset : "+lhs1.size());
		System.out.println("HashCode : "+lhs1.hashCode());
		System.out.println(lhs1.remove("Kartik"));
		System.out.println("Size of linkedhashset : "+lhs1.size());
		lhs1.forEach(System.out::println);

	}

}
