package learn.constructor;

public class StaticMethod {
	
	//int a;//Non static variable cannot accessible in static method.
	static void method()
	{
		//System.out.println("Sttaic method: " + a );
	}

	public static void main(String[] args) {
		method();

	}

}
