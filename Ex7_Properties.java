package DS_Collections;

import java.util.Properties;

public class Ex7_Properties
{
	public static void main(String args[])
	{
		Properties p=new Properties();
		//both feild(key,velue) should be string;
		p.setProperty("ranchi","chandan");
		p.setProperty("tata","madan");
		p.setProperty("dhanbad","Sonu");
		p.setProperty("bokaro","ajeet");
		p.setProperty("Bokaro","aman");
		
		System.out.println(p);
		System.out.println(p.getProperty("ranchi"));
	}

}
