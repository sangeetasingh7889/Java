package regexpression;

import java.util.regex.Pattern;

public class PredefinedCharacter {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[0-9]", "0"));
		System.out.println(Pattern.matches("\\d","9"));
		System.out.println(Pattern.matches("\\d", "10"));
		System.out.println(Pattern.matches("\\d", "0"));

	}

}
