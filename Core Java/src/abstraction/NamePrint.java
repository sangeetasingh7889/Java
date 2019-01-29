package abstraction;

public abstract class NamePrint {
	String fname;
	String lname;
	NamePrint()
	{
		System.out.println("Default Constructor");
	}
	void firstname(String fname)
	{
		this.fname=fname;
	}
	void lastname(String lname)
	{
		this.lname=lname;
	}
	abstract void display();
	abstract void print();
}
