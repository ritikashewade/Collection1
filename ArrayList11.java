//Write a Java program to test whether an array list 
//is empty or not.

package Collection1;

import java.util.ArrayList;

public class ArrayList11 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(9);
		al.add(40);
		System.out.println(al);
		al.clear();
		System.out.println(al.isEmpty());
	}
}
