package learn.thiskeyword;

public class ThiswithConstructor {
	
	ThiswithConstructor() {
		System.out.println("Default Constructor Called");
	}
	ThiswithConstructor(String name)
	{
		this();
		System.out.println("Hello" + name);
	}
	ThiswithConstructor(String name, int age)
	{
		this(name);
		System.out.println("Hello" + name + "Your age is" + age);
	}
	void mm()
	{
		System.out.println("mm() Called");
	}

	public static void main(String[] args) {
		ThiswithConstructor t = new ThiswithConstructor("Google", 50);
		t.mm();

	}

}
