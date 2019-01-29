package Array;

public class PrintEvenValue {

	public static void main(String[] args) {
		int arr1[] = {19,78,56,34,57,89};
		
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]%2==0)
			{
				System.out.println("Even Value: " + arr1[i]);
			}
		}

	}

}
