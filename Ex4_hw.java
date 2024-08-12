package DS_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex4_hw {
	public static void main(String args[])
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(12);
		arr.add(34);
		arr.add(56);
		arr.add(89);
		System.out.println(arr);
		
		ListIterator i=arr.listIterator();
		System.out.println("forward: ");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("backward: ");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
	}
}
