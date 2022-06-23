
public class File_2 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	void m1(double a)
	{
		System.out.print(a);
	}
	void m2(String b)
	{
		System.out.print(b);
	}
	void m3(boolean c)
	{
		System.out.print(c);
	}

	public static void main(String[] args) 
	{
		File_2 raja = new File_2();
		raja.m1(sc.nextDouble());
		raja.m2(sc.next());
		raja.m3(sc.nextBoolean());
	}

}
