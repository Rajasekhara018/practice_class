
public class File_3 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	static long m1(long a)
	{
		System.out.print(a);
		int iv =sc.nextInt();
		return iv;
	}
	char m2(char b)
	{
		System.out.print(b);
		char cv =sc.next().charAt(0);
		return cv;
	}
	boolean m3(boolean c)
	{
		System.out.print(c);
		boolean bv =sc.nextBoolean();
		return bv;
	}
	static String m4(String d)
	{
		System.out.print(d);
		String sv=sc.next();
		return sv;
	}
 public static void main(String[] args) 
	{
		File_3 raja = new File_3();
		System.out.println(raja.m1(sc.nextLong()));
		System.out.println(raja.m2(sc.next().charAt(0)));
		System.out.println(raja.m3(sc.nextBoolean()));
		System.out.println(raja.m4(sc.next()));

	}

}
