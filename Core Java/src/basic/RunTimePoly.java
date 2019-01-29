package basic;

class TimePoly {
	String name;
	void getName(String name)
	{
		this.name=name;
	}
	String display()
	{
		return "P:  "+name;
	}
}
public class RunTimePoly extends TimePoly{
	String name;
	void getName(String name)
	{
		this.name=name;
	}
	String display()
	{
		return "C:  "+name;
	}
	public static void main(String[] args) {
		RunTimePoly tp = new RunTimePoly();
		tp.getName("Sangeeta");
		System.out.println(tp.display());
	}

}
