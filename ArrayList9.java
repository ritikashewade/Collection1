// Write a Java program to clone an array list to 
//another array list.

package Collection1;

import java.util.ArrayList;

public class ArrayList9 {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(9);
	al.add(40);
	System.out.println(al);
	ArrayList al1 = new ArrayList();
	System.out.println(al.clone());
	
}
}
