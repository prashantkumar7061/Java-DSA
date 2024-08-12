package DS_Collections;

import java.util.Arrays;
import java.util.List;

class book
{
	int id;
	String aname;
	String bname;
	public book(int id, String aname, String bname)
	{
		super();
		this.id = id;
		this.aname = aname;
		this.bname = bname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", aname=" + aname + ", bname=" + bname + "]";
	}
	
}

public class Ex10_StringApI
{
	public static void main (String args[])
	{
		book b1=new book(12,"rakesh","john walker");
		book b2=new book(31,"mukesh","rock");
		book b3=new book(15,"mala","shaily");
		book b4=new book(18,"ajeet","jaitly");
		book b5=new book(22,"rakesh","max");
		book b6=new book(32,"vikash","warner");
		book b7=new book(16,"mahkesh","lee");
		List<book> books=Arrays.asList(b1,b2,b3,b4,b5,b6,b7);
		//System.out.println(books);
		
		//for(Object ab:books) //old traditonal style
		//System.out.println(ab);
        
		//books.stream().forEach(p->System.out.println(p)); //lambda expression
        
		//books.stream().forEach(System.out::println);
        
		//books.stream().limit(3).forEach(System.out::println);
        
		//books.stream().skip(3).forEach(System.out::println);
        
		//long count=books.stream().count();
        
		//books.stream().skip(3).limit(2).forEach(System.out::println);
        //books.stream().map(x->x.getAname()).forEach(System.out::println);
        //books.stream().map(x->x.getAname()+" "+x.getBname()).forEach(System.out::println);
        //books.stream().filter(x->x.getAname().equals("rakesh")).forEach(System.out::println);
        //books.stream().filter(x->x.getId()>=50).forEach(System.out::println);
        //book.parallelStream().forEach(System.out::println); //this will random display so fast (H.W.)
		//List<Integer> in=Arrays.asList(90,-90,43,,12,3,4,45,-3,21);
		//in.stream().sorted().forEach(System.out::println);

}
}
