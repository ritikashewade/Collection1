//Write a Java program to compare two array lists.

package Collection1;

import java.util.ArrayList;

public class ArrayList6 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(9);
		al.add(40);
		System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(9);
		al1.add(40);
		System.out.println(al1);
		System.out.println(al.containsAll(al1));
		
		
	}
}
