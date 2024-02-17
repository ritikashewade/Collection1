//Write a Java program to reverse elements in an array list.

package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(9);
		al.add(40);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}
}
