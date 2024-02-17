//Write a Java program to replace the second element of 
//an ArrayList with the specified element.

package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList14 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(4);
		al.add(10);
		al.add(20);
		al.add(9);
		al.add(40);
		System.out.println(al);
		
		al.set(2, 13);
		System.out.println(al);
	
	}
}
