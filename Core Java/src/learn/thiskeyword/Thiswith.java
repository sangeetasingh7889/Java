
package learn.thiskeyword;

public class Thiswith {
	
	private String name= "Java";
	//private static String name = "Java";
	Thiswith(String name) {
		//this.name = name;
		//Thiswith.name = name;
		this.name = this.name;
		name = this.name;
	}
	void getName()
	{
		System.out.println("Hello " + name);
	}
	public static void main(String[] args) {
		ThiswithVariable t = new ThiswithVariable("Sangeeta", 15);
		t.show();
	}

}
