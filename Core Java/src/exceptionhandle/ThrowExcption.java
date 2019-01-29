package exceptionhandle;

import java.util.Scanner;

public class ThrowExcption {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Marks: ");
			int marks = sc.nextInt();
			if(marks==100)
			{
				throw new SangeetaException("Excellent");//Userdefined Exception with message
			}else if(marks>=33)
			{
				System.out.println("Result = Pass");
			}else
			{
				System.out.println("Result = Fail");
			}
		}catch(SangeetaException e)
		{
			System.out.println("Handle the exception");
		}

	}

}
