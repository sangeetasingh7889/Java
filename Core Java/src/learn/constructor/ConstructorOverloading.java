package learn.constructor;


public class ConstructorOverloading {
	
	public int age;
	
	public  ConstructorOverloading() {
		System.out.println("0 Argument constructor");
	}
	
	public ConstructorOverloading(int a) {
		System.out.println("1 int Argument constructor");
	}
	
	public ConstructorOverloading(float price) {
		System.out.println("1 float Argument constructor");
	}
	
	public ConstructorOverloading(String name, int age) {
		System.out.println("2 Argument constructor");
	}
	
	public void getAge() {
		System.out.println("Age is:  "+age);
	}
	
	
	
	public static void main(String[] args) {
		
		/*ConstructorOverloading c1 = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading(34.34f);
		ConstructorOverloading c3 = new ConstructorOverloading(34);
		ConstructorOverloading c4 = new ConstructorOverloading("Sangeeta",34);*/
		
		ConstructorOverloading c1 = new ConstructorOverloading(23.43f);
		c1.getAge();		
	}
}
