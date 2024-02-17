//Write a Java program for trimming the capacity 
//of an array list.

package Collection1;

import java.util.ArrayList;

public class ArrayList12 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(9);
		al.add(40);
		System.out.println(al);
		al.trimToSize();
		System.out.println(al.size());
		System.out.println(al);
		
	}
}
