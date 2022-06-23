
public class creator 
{

	public static void main(String[] args) 
	{
		student raja =new student(21, "raja", 123, "s1");
		System.out.println("hash of the raja in creator class:"+ raja.hashCode());
		System.out.println("age of raja is:" +raja.age);
		System.out.println("age of raja is:" +raja.name);

	}

}
