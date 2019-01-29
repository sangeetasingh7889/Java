package exceptionhandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExcption {

	public static void main(String[] args) {
		for(int i=1;i<=2;i++)
		{
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter first number");
				int a = sc.nextInt();
				System.out.println("Enter second number");
				int b = sc.nextInt();
				int c=a/b;
				System.out.println("Result"+c );
			}catch(ArithmeticException e)
			{
				e.printStackTrace();
			}catch(InputMismatchException e)
			{
				e.printStackTrace();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			System.out.println("Program will be continue:");
		}

	}

}
