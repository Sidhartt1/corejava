import java.util.Scanner;

public class world
{
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(int i = 1; i<=10 ; i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
	
}