package DS_Collections;

import java.util.Arrays;
import java.util.List;

class employee
{
	int id;
	String name;
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class ex10_Empdata
{
	public static void main(String atgs[])
	{
		employee e1=new employee(12,"ranjan");
		employee e2=new employee(11,"raju");
		employee e3=new employee(13,"aman");
		employee e4=new employee(12,"rana");
		
		//ArrayList<employee> emp=new ArrayList<employee>();
		//emp.add(e1);
		
		List<employee> emp=Arrays.asList(e1,e2,e3,e4);
		
		emp.stream().filter(m->m.getId()>30).forEach(k->System.out.println(k)); //lambda method
		
		
		}
}
