package wrapperclasses;

public class X {
	public void mm1(Integer x, Integer y){
		System.out.println(x + " " + y);
	}
	public void mm2(int x, int y)
	{
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		X obj = new X();
		int a=12;
		int b=15;
		
		obj.mm1(a, b);
		
		
		Integer v1=10;
		Integer v2 = 20;
		obj.mm2(v1, v2);

	}

}
