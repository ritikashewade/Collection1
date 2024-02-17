//Write a Java program to empty an array list.

package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList10 {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(9);
	al.add(40);
	System.out.println(al);
	al.clear();
	System.out.println(al);
}
}
