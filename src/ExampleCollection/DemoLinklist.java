package ExampleCollection;

import java.util.*;
public class DemoLinklist extends Exception {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.add("Mihir");
		l1.add("Bhagat");
		l1.add(1,"hello");
		System.out.println(l1.indexOf("hello"));
		
		Iterator<String> i =  l1.iterator();
		
		while(i.hasNext()){
			
			System.out.println(i.next());
		}
		
		List<String> l2 = new LinkedList<String>();
		l2.add("Mihir");
		l2.add("Bhagat");
		
		Iterator<String> i2 = l2.iterator();
		
		while(i2.hasNext()){

			System.out.println(i2.next());
		}
		
		System.out.println(l1.equals(l2));
		
		
		

	}

}
