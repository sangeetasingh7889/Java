package learn.inheritance;

public class Car extends Vehicle {
	
	@Override
	public void run() {
		super.run();// will invoke parent class run method
		int a=30;
		int b=50;
		System.out.println("Sum is: "+(a+b));
	}
	
	

	
	
	public static void main(String[] args) {
		Car c= new Car();
		c.run();
	}

}
