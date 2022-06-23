package package_1;

public class constructors 
{
 static java.util.Scanner sc = new java.util.Scanner(System.in);
 constructors(int a)
 {
	 System.out.print(a);
 }
 constructors(float b, long c)
 {
	 System.out.print(b);
	 System.out.print(c);
 }
 constructors(String d, long e, char f)
 {
	 System.out.print(d);
	 System.out.print(e);
	 System.out.print(f);
 }
	public static void main(String[] args) 
	{
		constructors raja1 = new constructors(sc.nextInt());
		constructors raja2 = new constructors(sc.nextFloat(), sc.nextLong());
		constructors raja3 = new constructors(sc.next(), sc.nextLong(), sc.next().charAt(0));
	}

}
