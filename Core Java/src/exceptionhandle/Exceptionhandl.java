package exceptionhandle;

public class Exceptionhandl {

	public static void main(String[] args) {
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		try {
			System.out.println(100/0);//ArithmeticException
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try{
			String nam = null;
			System.out.println(nam.length());//NullPointerException
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		try {
			int[] arr1= {1,2,3};
			System.out.println(arr1[3]);//ArayIndexOutofBoundException
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			String name = "Sangeeta";
			int i= Integer.parseInt(name);//NumberFormatException
			System.out.println(i);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Hello rest off code");
		System.out.println("Hello 4");
		System.out.println("Hello 5");
		System.out.println("Hello 6");
		System.out.println("Hello 7");
			}

}
