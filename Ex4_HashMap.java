package DS_Collections;

import java.util.HashMap;

public class Ex4_HashMap 
{
	public static void main(String args[])
	{
		HashMap<String, Integer> map=new HashMap<>();
		map.put("vishal",10);
		map.put("kushal", 20);
		map.put("Vaibhav", 30);
		map.put("Sicha", null);
		map.put("vishal",50 ); //always show letest velue in case of duplicate key.
		
		System.out.println(map);
		System.out.println(map.get("vishal"));
		
		
	}

}
