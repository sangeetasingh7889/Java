package exceptionhandle;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomException {
	
	static void getJioMobileNumber(String jio) throws MobileNumberFormatException{
		if(Pattern.matches("[6]{1}[3]{1}[0-9]{8}", jio))
		{
			System.out.println("Welcome to Jio Telecom Services");
		}else {
			throw new MobileNumberFormatException(": Number Start with 63");
		}
	}

	public static void main(String[] args) {
		System.out.println("Please enter JIO mobile number: ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		try {
			CustomException.getJioMobileNumber(num);
		}catch(MobileNumberFormatException m) {
			System.out.println(m);
		}
	}

}
