package polymorphism;

public class MethOverlodwithchangereturntype {
	
	public void mm(String name, int id)
	{
		System.out.println(name + id);
	}
	public void mm(int id, String name )
	{
		System.out.println(id + name);
	}
	public static void main(String[] args) {
		MethOverlodwithchangereturntype mr = new MethOverlodwithchangereturntype();
				mr.mm("Sangeeta", 23);

	}

}
