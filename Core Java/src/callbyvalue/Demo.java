package callbyvalue;

public class Demo {	
	int age=20;
	public void getAge(int age) {
		age =30;
		System.out.println("Changed Age is: "+age);//30
	}
	
	public static void main(String[] args) {
		Demo d= new Demo();
		
		System.out.println("Before Age:  "+d.age);//20
		
		d.getAge(d.age);
		
		System.out.println("After Age:  "+d.age);//30
	}

	
	
	// case of call-by-value, original value will not change.Effect will be applied to method 
	// body only.
}
