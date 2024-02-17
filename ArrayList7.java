//Write a Java program that swaps two elements
//in an array list.

package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList7 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(9);
		al.add(40);
		System.out.println(al);
		Collections.swap(al, 0, 2);
		System.out.println(al);
		
	}
}
