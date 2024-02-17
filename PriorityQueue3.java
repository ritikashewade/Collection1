//Write a Java program to add all the elements of a priority queue 
//to another priority queue.

package Collection1;

import java.util.PriorityQueue;

public class PriorityQueue3 {
	public static void main(String[] args) {
		PriorityQueue <Integer> pq = new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		System.out.println("pq= "+pq);
		PriorityQueue <Integer> pq1 = new PriorityQueue();
		pq1.addAll(pq);
		System.out.println("pq1= "+pq1);
	}
	
}
