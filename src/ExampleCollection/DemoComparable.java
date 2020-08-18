package ExampleCollection;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;

class Laptop implements Comparable<Laptop>{

	private int year;
	private String name;
	private double Rating;
	
	public Laptop(String name,int year,double Rating) {
		this.year = year;
		this.name = name;
		this.Rating = Rating;
	}
	
	public int compareTo(Laptop o) {
		
		return this.year - o.year;
	}
	
	public int getYear() { return this.year; }
	public String getName() { return this.name; }
	public double getRating() { return this.Rating; } 
	
}
	
public class DemoComparable  {

	public static void main(String[] args) {
		
		ArrayList<Laptop> l1 = new ArrayList<Laptop>();
		l1.add(new Laptop("lenovo",2000,7.5));
		l1.add(new Laptop("Dell",1985,8.5));
		l1.add(new Laptop("HP",1970,9.0));
		
		Collections.sort(l1);
		System.out.println("Laptop Company List");
		for(Laptop lp : l1) {
			System.out.println("Laptop Name : "+lp.getName()+" || Rating : "+lp.getRating()+" || Year : "+lp.getYear());
		}
	}
}
