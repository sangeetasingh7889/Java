package exceptionhandle;

public class ArrayIndxOutofBoundExcption {

	public static void main(String[] args) {
		try{
			int arr[] = {1,5,4,7};
			System.out.println("Enter the value: "+ arr[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		
	}

}
