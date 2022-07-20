public class world
{
	public static void main(String args[])
	{
		implicit();
		explicit();
	}
	static void implicit()
	{
		char a = 'F';
		int b = a;
		System.out.println(b);
	}
	static void explicit()
	{
		int a = 70;
		char b = (char) a;
		System.out.println(b);
	}
	
}