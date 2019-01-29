package exceptionhandle;

public class ExceptionHandleinOneTry {

	public static void main(String[] args) {
		//Below program will give one exception at once after resolve 
		//the one exception then other exception will be resolve
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		try {
			System.out.println(100/200);//ArithmeticException
			
			String nam = "Sangeeta";
			System.out.println(nam.length());//NullPointerException
					
			int[] arr1= {1,2,3};
			System.out.println(arr1[2]);//ArayIndexOutofBoundException
					
			String name = "1111111";
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
