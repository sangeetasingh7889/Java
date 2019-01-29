package Array;

public class FindDuplicatevalue {

	public static void main(String[] args) {
		int arr1[] = {100,67,400,100,34,67,400,89,56};
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=i+1; j<arr1.length; j++)
			{
				if(arr1[i]==(arr1[j])) {
					System.out.println(arr1[j]);
				}
			}
		}
	}
}
