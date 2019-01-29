package learn.constructor;

public class Staticvariable {
	static int a;
	
	void meth()
	{
		//static int aaa=304;//Static variable cannot be local.
		System.out.println("Static variable: " + a);                      
	}

	public static void main(String[] args) {
		Staticvariable sv = new Staticvariable();
				sv.meth();
				
				System.out.println(a);//Static variable can be accessible from static method.

	}

}
