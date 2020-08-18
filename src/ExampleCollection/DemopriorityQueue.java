package ExampleCollection;
import java.util.*;
public class DemopriorityQueue {
	
	public static void main(String []args) {
		
		PriorityQueue<Integer> q1 = new PriorityQueue<Integer>(2);  // First pqueue
		q1.offer(9);
		q1.offer(8);
		q1.offer(1);
		q1.offer(54);
		q1.offer(4);
		q1.offer(5);
		q1.offer(50);
		System.out.println("Priority Queue isEmpty : "+q1.isEmpty()); //Checking the pqueue is empty or not!!!
		System.out.println("Size of pqueue : "+q1.size());
//		System.out.println(q1.poll());
//		System.out.println(q1.poll());
//		System.out.println(q1.poll());
//		System.out.println(q1.poll());
//		System.out.println(q1.poll());
//		System.out.println(q1.poll());
//		System.out.println(q1.poll());
//		System.out.println(q1.poll());

		Iterator<Integer> i1 = q1.iterator();
		
		System.out.println("Printing pqueue 1 using while loop");
		while(i1.hasNext()) {
			System.out.println(i1.next());  // getting wrong sequence while printing (By using looping statement only).
			//System.out.println(q1.peek());
		}
		System.out.println("Printing pqueue 1 using advanced for loop");
		for(int i : q1) {
			System.out.println(i);
		}
		
		Spliterator<Integer> sp1 = q1.spliterator();
		System.out.println("Printing Pqueue using Spliterator:-");
		sp1.forEachRemaining(System.out::println);
		
//		PriorityQueue<Integer> q2 = new PriorityQueue<Integer>(new Comparator<Integer>() {   
//
//			public int compare(Integer arg0, Integer arg1) {  // usingn comparator to sort pqueue on the basis of last digit of the element.
//				if(arg0%10>arg1%10)
//					return 1;
//				return 0;
//			}
//			
//		});
//		
//		q2=q1;
//		System.out.println("Printing second pqueue");
//		System.out.println(q2.poll());
//		System.out.println(q2.poll());
//		System.out.println(q2.poll());
//		for(int i2 : q2) {
//			System.out.println(q2.poll());
//		}
		
		
	}
}

