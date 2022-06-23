
public class File_5
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	static void m1()
	{
		System.out.println("Badam Rajasekhara Reddy");
	}
	void m2()
	{
		System.out.println("Swapna");
	}
	static void m3(int a)
	{
		System.out.print(a);
	}
	void m4(float b)
	{
		System.out.print(b);
	}
	static int m5()
	{
		int iv =sc.nextInt();
		return iv;
	}
	 float m6()
	{
		float fv =sc.nextFloat();
		return fv;
	}
	static float m7(String c)
	{
		System.out.print(c);
		float fv =sc.nextFloat();
		return fv;
	}
	char m8(String d)
	{
		System.out.print(d);
		char cv =sc.next().charAt(0);
		return cv;
	}
	public static void main(String[] args) 
	{
		File_5 raja = new File_5();
		raja.m1();
		raja.m2();
		raja.m3(sc.nextInt());
		raja.m4(sc.nextFloat());
		System.out.print(raja.m5());
        System.out.print(raja.m6());
		System.out.print(raja.m7(sc.next()));
		System.out.print(raja.m8(sc.next()));
	}

}
