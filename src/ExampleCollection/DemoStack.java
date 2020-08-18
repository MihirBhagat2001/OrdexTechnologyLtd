package ExampleCollection;
import java.util.*;

public class DemoStack {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(123);
		s1.push(456);
		s1.push(789);
		s1.pop();
		Iterator<Integer> i = s1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
