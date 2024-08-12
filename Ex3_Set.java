package DS_Collections;

import java.util.HashSet;
import java.util.Set;

public class Ex3_Set
{
	public static void main(String args[])
	{
		//LinkedHashSet and TreeSet
		HashSet<Integer> h=new HashSet<Integer>();//no duplicate and rendomize
		h.add(90);
		h.add(87);
		h.add(76);
		h.add(90);
		h.add(45);
		h.add(87);
		System.out.println(h);
		
		Set<String> s=new HashSet<String>();
		s.add("ranchi");
		s.add("patna");
		s.add("ranchi");
		s.add("dhanbad");
		System.out.println(s);
	}

}


//Hashmap Hastable properties vector