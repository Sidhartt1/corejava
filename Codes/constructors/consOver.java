package constructors;

public class consOver {
	int a;
	consOver()
	{
		a = 10;
	}
	consOver(int a)
	{
		this.a = a;
	}
	public static void main(String[] args)
	{
		consOver c1 = new consOver();
		consOver c2 = new consOver(20);
		System.out.println(c2.a);
	}
}
