package learn.thiskeyword;

public class ThisKeyword {
	
	private String name = "Facebook";
	ThisKeyword(String str) {
		name = str;
		str = this.name;
		System.out.println(name);
	}
	void getName()
	{
		System.out.println("Hello " + name);
		System.out.println("Hello " + this.name);
		
	}

	public static void main(String[] args) {
		ThisKeyword t = new ThisKeyword("Google");
		t.getName();

	}

}
