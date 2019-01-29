package learn.thiskeyword;

public class ThiswithVariable {
	String name;
	int age;
	ThiswithVariable( String name, int age) {
		name = name;//This is the problem which indicate it locally
		age = age;//This is the problem which indicate it locally. To point the global variable we are using this keyword. 
		this.name = name;
		this.age = age;
	}
	void show()
	{
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		ThiswithVariable t = new ThiswithVariable("Sangeeta", 15);
		t.show();
	}

}
