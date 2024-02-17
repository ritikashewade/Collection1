//Write a Java program to remove 
//all elements from a priority queue.

package Collection1;

import java.util.PriorityQueue;

public class PriorityQueue5 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		System.out.println(pq);
		pq.removeAll(pq);
		System.out.println(pq);
	}
}
