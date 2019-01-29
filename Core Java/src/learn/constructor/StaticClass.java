package learn.constructor;

public class StaticClass {
	
	StaticClass(){
		System.out.println("Outer constructor");
	}
	
	
	void outerMM() {
		System.out.println("Method of Outer class");
	}
	
	static class InnerClass{
		
		void innerMM() {
			System.out.println("Method of inner class");
		}
	}

	public static void main(String[] args) {		
		StaticClass sc = new StaticClass();
		sc.outerMM();
		
		StaticClass.InnerClass obj = new InnerClass();
		obj.innerMM();
	}

}
