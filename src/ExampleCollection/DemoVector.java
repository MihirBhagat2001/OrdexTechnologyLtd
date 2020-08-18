package ExampleCollection;

import java.util.Iterator;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		v1.add(6);
		v1.add(7);
		v1.add(8);
		
		v1.remove(0);// Here, index number zero element is removed from the vector
		
		for(int i : v1){ //printing vector using advance for loop
			System.out.println(i);
		}
		Vector v2 = new Vector(); //non-genric
		v2.add(12);
		v2.add("Mihir");
		
		Iterator i = v2.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		

	}

}
