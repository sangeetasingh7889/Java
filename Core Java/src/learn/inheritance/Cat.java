package learn.inheritance;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}	
}

//If there multiple parameterized constructor in parent class, there must be at
//least one matching argument constructor and have to call parent class constructor
//using super from child class constructor.