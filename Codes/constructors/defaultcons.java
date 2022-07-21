package constructors;

public class defaultcons 
{
	int a;
	int b;
	defaultcons(int x, int y)
	{
		a = x;
		b = y;
	}
	void print()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		defaultcons d1 = new defaultcons(1,2);
		d1.print();
		
	}

}
