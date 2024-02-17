//Write a Java program to sort a given array list.
//(using in built  method and also without using  methods

package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(9);
		al.add(40);
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
	}
}
