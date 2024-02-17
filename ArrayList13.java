//Write a Java program to increase an array list size.


package Collection1;

import java.util.ArrayList;

public class ArrayList13 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(4);
		al.add(10);
		al.add(20);
		al.add(9);
		al.add(40);
		al.ensureCapacity(2);
		al.add(109);
		al.add(11);
		System.out.println(al);
	
	
		
		
		
	}
}
