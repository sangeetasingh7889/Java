package learn.inheritance;

public class B  extends A{

	public B(String name,int a) {
		super(name);		
		System.out.println("Hello,  "+name+", your are "+a+" years old");
	}
	
	public static void main(String[] args) {
		B b = new B("Ajit", 50);
	}

}

//Program to demonstrate if Parent class has only parameterized constructor, it will force to child class to create same
//arguments constructor in child class as well or multiple arguments constructor. And we need to call parent class constructor
// using super keyword from child class constructor.
