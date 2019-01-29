package learn.thiskeyword;

public class ThiswithMethod {
	
	ThiswithMethod() {
		System.out.println("Constructor called");
	}
	public void mm1()
	{
		System.out.println("mm1 called");
	}
	public void mm2()
	{
		mm1();
		this.mm1();
	}

	public static void main(String[] args) {
		ThiswithMethod t = new ThiswithMethod();
		t.mm2();

	}

}
