package ExampleCollection;
import java.util.*;
public class DemoComparator {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(345);
		l1.add(6454);
		l1.add(646);
		l1.add(444);
		
		Comparator<Integer> com = new Comparator<Integer>(){

			
			public int compare(Integer o1, Integer o2) {  
				
				if(o1%10>o2%10)
					return 1;
					
				return -1;
			}
		};
		
		Collections.sort(l1, com);
		System.out.println(l1.equals(l1));
		
		for(int i : l1){
			System.out.println(i);
		}
		
	}

}
