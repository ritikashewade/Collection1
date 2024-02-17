// Write a Java program to print all the elements 
//of an ArrayList using the elements' position.

package Collection1;

import java.util.ArrayList;

public class ArrayList15 {
public static void main(String[] args) {
	ArrayList al = new ArrayList(4);
	al.add(10);
	al.add(20);
	al.add(9);
	al.add(40);
//	System.out.println(al);
	
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
}
}
