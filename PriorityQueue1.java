//Write a Java program to create a priority queue, add some colors (strings)
//and print out the elements of the priority queue.

package Collection1;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add("red");
		pq.add("pink");
		pq.add("pink");
		System.out.println(pq);
	}
}
