//Write a Java program to compare two priority queues.

package Collection1;

import java.util.PriorityQueue;

public class PriorityQueue7 {
public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	pq.add(10);
	pq.add(20);
	pq.add(30);
	pq.add(40);
	System.out.println(pq);
	
	PriorityQueue pq1 = new PriorityQueue();
	pq1.add(10);
	pq1.add(20);
	pq1.add(300);
	pq1.add(40);
	System.out.println(pq1);
	
	for (Object val : pq){
        System.out.println(pq1.contains(val));
     } 
}
}
