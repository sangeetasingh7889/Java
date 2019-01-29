package learn.inheritance;

public class Child extends Parent{
	
	public Child() {
		//super();
		System.out.println("Child Created");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
	}
}
