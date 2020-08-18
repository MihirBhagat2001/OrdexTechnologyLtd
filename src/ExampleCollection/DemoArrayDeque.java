package ExampleCollection;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class DemoArrayDeque {

	public static void main(String[] args) {
		
		Deque<Integer> dq1 = new ArrayDeque<Integer>();
		dq1.offer(1); // Don't return boolean value true or false
		dq1.offer(2);
		dq1.offer(3);
		dq1.add(4);   // return's boolean value. so, we could check that the value has been inserted or not.
		dq1.add(5);
		dq1.offer(6);
		dq1.offer(7);
		dq1.offer(8);
		dq1.offerFirst(0);
		dq1.offerLast(9);
		
		System.out.println("calling poll method : "+dq1.poll());  // It is used to retrieves and removes the head of this deque, or returns null if this deque is empty.
		System.out.println("calling pollLast method : "+dq1.pollLast());
		System.out.println("calling remove method :"+dq1.remove());  //  It is used to retrieves and removes the head of this deque.
		System.out.println("calling removeLast method : "+dq1.removeLast());
		System.out.println("calling element method : "+dq1.element()); // It is used to retrieves, but does not remove, the head of this deque
		System.out.println("calling peek method : "+dq1.peek());  //  It is used to retrieves, but does not remove, the head of this deque, or returns null if this deque is empty.
		
		for(int i : dq1){
			System.out.println(i);
		}
	}
}
