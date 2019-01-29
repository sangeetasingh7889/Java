package basic;

public class Printname {
	
	String fnam;
	String lnam;
	
	Printname(String fnam)
	{
		this.fnam=fnam;
		System.out.println("First name: " + fnam);
	}
	void meth(String lnam)
	{
		this.lnam=lnam;
		System.out.println("Last name: " + lnam);
	}
	void meth1()
	{		
		System.out.println("Name will be: " + fnam + lnam);
	}

	public static void main(String[] args) {
		Printname pn = new Printname("Sangeeta");
		pn.meth("Singh");
		pn.meth1();
}

}
