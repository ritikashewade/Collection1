// Write a Java program to join two array lists

package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList8 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(9);
		al.add(40);
		System.out.println(al);
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(90);
		al1.add(400);
		al1.add(al);
		System.out.println(al1);
//		System.out.println(al.addAll(al1));
		
	}
}
