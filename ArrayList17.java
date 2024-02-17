//Write a Java program to iterate through all elements 
//in an array list.


package Collection1;

import java.util.ArrayList;

public class ArrayList17 {
	public static void main(String[] args) {
		ArrayList color = new ArrayList();
		color.add("Red");
		color.add("Blue");
		color.add("Purple");
		color.add("Pink");
		for(Object c : color)
		{
			System.out.println(c);
		}
	}
}
