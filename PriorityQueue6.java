//Write a Java program to count the number 
//of elements in a priority queue.

package Collection1;

import java.util.PriorityQueue;

public class PriorityQueue6 {
public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	pq.add(10);
	pq.add(20);
	pq.add(30);
	pq.add(40);
	System.out.println(pq);
	System.out.println(pq.size());
}
}
