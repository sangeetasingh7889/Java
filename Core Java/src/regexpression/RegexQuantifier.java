package regexpression;

import java.util.regex.Pattern;

public class RegexQuantifier {

	public static void main(String[] args) {
		//x, once or not at all
		System.out.println(Pattern.matches("[0-9]?", ""));
		System.out.println(Pattern.matches("[0-9]?", " "));
		System.out.println(Pattern.matches("[0-9]?", "0"));
		System.out.println(Pattern.matches("[0-9]?", "9"));
		System.out.println(Pattern.matches("[0-9]?", "98"));
		
		System.out.println("************************");
		
		//x, zero or more times
		System.out.println(Pattern.matches("[0-9]*", ""));
		System.out.println(Pattern.matches("[0-9]*", " "));
		System.out.println(Pattern.matches("[0-9]*", "0"));
		System.out.println(Pattern.matches("[0-9]*", "9"));
		System.out.println(Pattern.matches("[0-9]*", "98"));
		System.out.println(Pattern.matches("[0-9]*", "98456445"));
		
		System.out.println("************************");
		
		//x, one or more times
		System.out.println(Pattern.matches("[0-9]+", ""));
		System.out.println(Pattern.matches("[0-9]+", " "));
		System.out.println(Pattern.matches("[0-9]+", "0"));
		System.out.println(Pattern.matches("[0-9]+", "9"));
		System.out.println(Pattern.matches("[0-9]+", "98"));
		System.out.println(Pattern.matches("[0-9]+", "98456445"));
		
		System.out.println("************************");
		
		//x, n times only
		System.out.println(Pattern.matches("[0-9]{10}", ""));
		System.out.println(Pattern.matches("[0-9]{10}", " "));
		System.out.println(Pattern.matches("[0-9]{10}", "0"));
		System.out.println(Pattern.matches("[0-9]{10}", "9"));
		System.out.println(Pattern.matches("[0-9]{10}", "98"));
		System.out.println(Pattern.matches("[0-9]{10}", "9845644534"));
		
		System.out.println("************************");
		
		System.out.println(Pattern.matches("X|Y", "x"));
		System.out.println(Pattern.matches("X|Y", "y"));
		System.out.println(Pattern.matches("X|Y", "X"));
		System.out.println(Pattern.matches("X|Y", "Y"));
		System.out.println(Pattern.matches("M|F", "x"));
		System.out.println(Pattern.matches("M|F", "F"));
		
		
	}

}
