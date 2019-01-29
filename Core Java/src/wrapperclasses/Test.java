package wrapperclasses;

public class Test {
	public static void main(String[] args) {
		
		int a=10;
		Integer i = Integer.valueOf(a);//auto-boxing (conversion primitive to object)
		Integer x = a;//Integer.valueOf(a);//auto-boxing
		System.out.println(x);
		
		Integer obj =20;
		int r = obj.intValue();//un-boxing(Conversion of Object to primitive)
		int s = obj;//obj.intValue();//un-boxing(Conversion of Object to primitive)
		System.out.println(s);
		System.out.println(r);
		
	}

}
