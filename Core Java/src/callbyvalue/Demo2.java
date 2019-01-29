package callbyvalue;

import java.util.Date;

public class Demo2 {
	
	int age=30;
	
	
	
	
	public void getAge(Demo2 d) {
		d.age  =40;
		System.out.println("Changed age: "+d.age);
	}
	
	public static void main(String[] args) {
		
		String str[] = new String[] {"abc","cde"};
		
		
		Demo2 d = new Demo2();
		System.out.println("Before To Change: "+d.age);//30
		d.getAge(d);//40
		System.out.println("After To Change: "+d.age);//40
		
		
	}

}
