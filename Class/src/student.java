
public class student 
{
	int id;
	String name;
	int age;
	String section;
	
	public student (int age, String name, int id, String section)
	{
		System.out.println("hash of the current objec in student class:"+ this.hashCode());
		this.id=id;
		this.name=name;
		this.age=age;
		this.section=section;
	}
	
	public void write(String name)
	{
		System.out.println("marks of student:"+name+"is");
	}
	public void reading( )
	{
		System.out.print("i can read");
	}
	public void write()
	{
		System.out.print("i can write");
	}
	public void play( )
	{
		System.out.print("i can play");
	}
}
