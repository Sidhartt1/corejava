package constructors;

public class thisope 
{
	int a;
	int b;
	thisope(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args)
	{
		thisope t1 = new thisope(1,2);
		System.out.println(t1.a+t1.b);
	}
}
