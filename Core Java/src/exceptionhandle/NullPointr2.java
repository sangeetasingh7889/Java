package exceptionhandle;

import java.util.Scanner;

public class NullPointr2 {

	static NullPointr1 obj;
	public static void main(String[] args) {
		for(int i=1;i<=2;i++)
		{
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the first number: ");
				int a = sc.nextInt();
				System.out.println("Enter the second number: ");
				int b = sc.nextInt();
				obj.setValue(a,b);
				obj.display();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
