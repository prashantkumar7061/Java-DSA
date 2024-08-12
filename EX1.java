package DS_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EX1
{
	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList<Integer> ();
		a.add(90);
		a.add(32);
		a.add(45);
		a.add(67);
		a.add(99);
		a.add(21);
		a.add(22);
		a.add(44);
		a.add(90);
		System.out.println(a);
		
		for (int p:a)
		{
			System.out.println(p);
		}
		
		List<String> city=Arrays.asList("Ranchi","Patna","delhi","london");
		System.out.println(city);
		for(String s:city)
			System.out.println(s);
	}

}
