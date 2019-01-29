package learn.inheritance;

public class Emp extends SuperEmp{	
	
	/*
	 following code will be written by compiler internally
	public Emp() {
		super();
	}*/
	
	public static void main(String[] args) {
		Emp e = new Emp();
	}
}

// If there dc in child class and not constructor in child class, there will be no error because now compiler will
// add dc in child class. 
