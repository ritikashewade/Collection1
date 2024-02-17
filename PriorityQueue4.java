//Write a Java program to insert 
//a given element into a priority queue.

package Collection1;

import java.util.PriorityQueue;

public class PriorityQueue4 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.offer(10);
		pq.add(40);
		pq.offer(60);
		pq.add(90);
		System.out.println(pq);
	}
}
