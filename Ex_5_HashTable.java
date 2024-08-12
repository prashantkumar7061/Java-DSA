package DS_Collections;

import java.util.Hashtable;

public class Ex_5_HashTable
{
	public static void main(String args[])
	{
		Hashtable<String, Integer> map=new Hashtable<>();
		
		map.put("manish", 22);
		map.put("dinesh",20 );
		map.put("rokd", 12);
		
		System.out.println(map);
	}

}
