package ExampleCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CompareRating implements Comparator<Laptop>{

	public int compare(Laptop obj1,Laptop obj2) {
		
		if(obj1.getRating()>obj2.getRating())				//return positive value (i.e 1) means swap, return negative value (i.e -1) means not to swap
														//return zero means equal. 
			return 1;
		else if(obj1.getRating()<obj2.getRating()) 
			return -1;
		else
			return 0;
	}
	
}
class CompareName implements Comparator<Laptop>{
	
	public int compare(Laptop obj1,Laptop obj2) {
		
		return obj1.getName().compareTo(obj2.getName()); //Using compareTo method previously implemented in Laptop class (uses ascii value to compare
														 //Refer the compareTo method for logic in DemoComparable class...
	}
}
public class DemoComparator2 {
	
	public static void main(String []args) {
		
		ArrayList<Laptop> a1 = new ArrayList<Laptop>();
		a1.add(new Laptop("HP",1975,9.0));
		a1.add(new Laptop("Lenovo",2000,7.0));
		a1.add(new Laptop("Dell",1980,8.5));
				
		System.out.println("Sorting By Name");
		CompareName c1 = new CompareName();
		Collections.sort(a1,c1);
		for(Laptop l1 : a1) {
			System.out.println("Laptop Name : "+l1.getName()+" || Rating : "+l1.getRating()+" || Year : "+l1.getYear());
		}
		
		System.out.println("Sorting By Ratings");
		CompareRating c2 = new CompareRating();
		Collections.sort(a1,c2);
		for(Laptop l2 : a1) {
			System.out.println("Laptop Name : "+l2.getName()+" || Rating : "+l2.getRating()+" || Year : "+l2.getYear());
		}
		
		System.out.println("Sorting By Year");
		Collections.sort(a1);
		for(Laptop l3 : a1) {
			System.out.println("Laptop Name : "+l3.getName()+" || Rating : "+l3.getRating()+" || Year : "+l3.getYear());
		}
	}

}
