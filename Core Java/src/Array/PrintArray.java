package Array;

public class PrintArray {

	public static void main(String[] args) {
		//declare the array
		int marks[]= {23,45,34,78,56,89};
		
		//print value from for loop
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("======================");
		
		//print value from for each loop
		for(int m:marks)
		{
			System.out.println(m);
		}
		
		//Chnage the value
		System.out.println(marks[3]);
		marks[3]=100;
		System.out.println(marks[3]);
		
		//Exception mesage "java.lang.ArrayIndexOutOfBoundsException"
		marks[8]=10;
		System.out.println(marks[8]);
	}

}
