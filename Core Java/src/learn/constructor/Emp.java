package learn.constructor;

public class Emp {
	
	public void Emp() {
		System.out.println("Hello");
	}
	
	public Emp() {
		System.out.println("Hi");
		new Emp();
	}
	
	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = e1;//assigning e1 to e2;
	}
	
}
