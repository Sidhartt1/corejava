public class world
{
	int id = 1;
	double salary = 2000;
	String gender = "male";
	static int cars = 10;
	
	public static void main(String args[])
	{
		String name = "ravi";
		world demo = new world();
		System.out.println(demo);
		System.out.println(demo.id);
		System.out.println(demo.salary);
		System.out.println(demo.gender);
		System.out.println(cars);
	}
}