package exceptionhandle;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		try {
			System.out.println(100/2);//ArithmeticException
			
			String nam = "Sangeeta";
			System.out.println(nam.length());//NullPointerException
			
			String bok = "JavaBlackbook";
			System.out.println(bok.charAt(13));
			
			int[] arr1= {1,2,3};
			System.out.println(arr1[3]);//ArayIndexOutofBoundException
					
			String name = "Sangeeta";
			int i= Integer.parseInt(name);//NumberFormatException
			System.out.println(i);
		}catch(ArithmeticException e) {
			System.out.println("===========ArithmeticException :"+ e);
		}catch(NullPointerException e) {
			System.out.println("===========NullPointerException :"+ e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("===========ArrayIndexOutOfBoundsException :"+ e);
		}catch(NumberFormatException e) {
			System.out.println("===========NumberFormatException :"+ e);
		}catch(Exception e) {
			System.out.println("===========JavaTPoint :"+ e);
		}					
		System.out.println("Hello rest off code");
		System.out.println("Hello 4");
		System.out.println("Hello 5");
		System.out.println("Hello 6");
		System.out.println("Hello 7");


	}

}
