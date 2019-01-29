package abstraction;

public abstract class ProductInfo {
	static {
		System.out.println("Static Block");
	}
	{
	System.out.println("Instance Block");
	}
	public ProductInfo()
	{
		System.out.println("Constructor");
	}
	public void info1()
	{
		System.out.println("Non abstract method");
	}
	public abstract void info2();
}
