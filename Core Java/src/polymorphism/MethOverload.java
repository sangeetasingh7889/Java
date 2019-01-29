package polymorphism;

public class MethOverload {
	
	public void info(int i, long l)
	{
		System.out.println(i+" "+l);
	}
	public void info(long l, int i)
	{
		System.out.println(i+" "+l);
	}
	public static void main(String[] args) {
		MethOverload mo = new MethOverload();
//		mo.info(10,10); //The method info(int, long) is ambiguous for the type MethOverload
	}

}
