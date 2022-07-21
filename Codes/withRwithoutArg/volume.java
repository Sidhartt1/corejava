package withRwithoutArg;

public class volume {
	public static void main(String args[]) {
		boxdetail v1 = new boxdetail();
		v1.l = 2;
		v1.b = 3;
		v1.h = 4;
		System.out.println("Volume of the class box: "+v1.volume());
	}
	
	
}
