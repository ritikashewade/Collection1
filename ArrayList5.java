//Write a Java program to extract a portion of an array list.

package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(9);
		al.add(40);
		System.out.println(al);
		System.out.println(al.subList(0, 2));
		
	}
}

