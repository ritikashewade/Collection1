//Write a Java program to copy one array list into another.

package Collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(9);
	al.add(40);
	System.out.println(al);
	List.copyOf(al);
	System.out.println(al);
	
}
}
