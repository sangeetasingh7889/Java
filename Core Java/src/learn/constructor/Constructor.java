package learn.constructor;

public class Constructor {
	public Constructor()
	{
		super();
		System.out.println("Object created");
	}
	void function()
	{
		System.out.println("Method created");
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		
	}

}
