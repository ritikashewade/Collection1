//Write a Java program to iterate through all elements 
//in the priority queue.

package Collection1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueue2 {
  public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<String>();  
  pq.add("Ram");
  pq.add("laxman");
  pq.add("sita");
  pq.add("ravan");
  pq.add("draupadi");
  
System.out.println(pq);
  for (String str:pq) 
  {
    System.out.println(str);
  }
 }
}
//Iterator i = pq.iterator();
//Object e = i.next();
//System.out.println();
