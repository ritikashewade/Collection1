package Collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class List1 {
	public static void main(String[] args) {
		LinkedList ref = new LinkedList();
		ref.add("adc");
		ref.add("fyh");
//		System.out.println(ref);
		String x = ref.get(0).toString();
		int l = x.length();
		int q=0;
		for(int i=0;i<l;i++) {
//			System.out.println(x.charAt(i));
			for(int j=i+1;j<l;j++)
			{
//				System.out.println( x.charAt(i));
//				System.out.println(x.charAt(j));
				System.out.println(Integer.compare(x.charAt(i), x.charAt(j)));
				
			}
		}
		
		 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}	
