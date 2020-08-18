package ExampleCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoArraylist {

	public static void main(String[] args) throws Exception{
		List<Integer> values = new ArrayList<Integer>();
		values.add(3);
		//values.add("Mihir");
		values.add(2);
		values.add(1);
		System.out.println(values.contains(234)); //output will be false.
		Collections.sort(values);
		
		Iterator<?> i2 = values.iterator();
		System.out.println(i2.next());
		System.out.println(i2.next());
		System.out.println(i2.next());
		
		Collections.reverse(values);
		for(Object i : values){
			System.out.println(i);
		} 
		System.out.println(values.size()); //display's the size of the Collection object.
		values.clear();
		System.out.println(values.size());
		System.out.println(values.isEmpty());
		
		ArrayList<Object> values2 = new ArrayList<Object>();
		values2.add(123);
		values2.add("Mihir");
		values2.set(0, 111111); // Setting 111111 on 0 index of arraylist.  
		System.out.println(values2.get(0)); // getting index no. 0 from arraylist..
		for(Object i3 : values2){
			System.out.println(i3);
		}
		Iterator<Object> i4 = values2.iterator();
		while(i4.hasNext()){
			System.out.println(i4.next());
		}
		
		
		
	}

}
