package exceptionhandle;

import java.util.Scanner;

public class NullPointrExcption {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			//String nam = "Sangeeta";
			String nam = null;
			System.out.println("Enter the length of Name: " + nam.length());
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		

	}

}
