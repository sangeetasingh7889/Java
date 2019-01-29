package basic;

public class Call4ConstrbySinglCons {
	
	Call4ConstrbySinglCons()
	{
		this(2);
		System.out.println("Constructor1");
		//new Call4ConstrbySinglCons(2);
	}
	Call4ConstrbySinglCons(int a)
	{
		this("Sangeeta");
		System.out.println("Constructor2");
		//new Call4ConstrbySinglCons("Sangeeta");
	}
	Call4ConstrbySinglCons(String a)
	{
		this(2.1f);
		System.out.println("Constructor3");
		/*Call4ConstrbySinglCons cs = new Call4ConstrbySinglCons(2.1f);*/
		//new Call4ConstrbySinglCons(2.1f);
	}
	Call4ConstrbySinglCons(float a)
	{
		System.out.println("Constructor4");
	}

	public static void main(String[] args) {
		Call4ConstrbySinglCons cs = new Call4ConstrbySinglCons();

	}

}
