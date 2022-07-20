import java.util.Scanner;

public class world
{
	public static void main(String args[])
	{
		for(int a=1; a<=3 ; a++)
		{
			for(int b=1; b<=3; b++)
			{
				if(a==2 && b==2)
				{
					break;
				}
				System.out.println(a+" "+b);
			}
		}
	}
	
}
