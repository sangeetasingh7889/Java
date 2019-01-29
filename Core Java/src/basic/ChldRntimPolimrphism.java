package basic;

class PrntRntimPolimrphism {
	
	void black()
	{
		System.out.println("Parent black method");
	}

}
public class ChldRntimPolimrphism extends PrntRntimPolimrphism {
	
	/*void black()
	{
		System.out.println("Child black method");
	}*/

	public static void main(String[] args) {
		ChldRntimPolimrphism cp = new ChldRntimPolimrphism();
		cp.black();
	}

}
