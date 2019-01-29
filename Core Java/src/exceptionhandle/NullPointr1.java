package exceptionhandle;

public class NullPointr1 {
	private int first;
	private int second;
	public void setValue(int a, int b)
	{
		first=a;
		second=b;
	}
	public int result()
	{
		return first/second;
	}
	public void display()
	{
		System.out.println("Result=" + result());
	}
}
