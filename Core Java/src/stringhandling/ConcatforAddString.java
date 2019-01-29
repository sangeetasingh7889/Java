package stringhandling;

public class ConcatforAddString {

	public static void main(String[] args) {
		String s1 = "Hello";
		s1=s1.concat("Sangeeta");
		System.out.println(s1);
		
		String s2="Hello";
		s2=s2+"Sangeeta Singh";
		System.out.println(s2+"Sangeeta Singh"+" "+s2);
		
		int a= 10;
		int b= 30;
		System.out.println(a+b+" "+a+b);
		System.out.println(a+b+" "+(a+b));

	}

}
