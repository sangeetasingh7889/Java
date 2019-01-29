package regexpression;

import java.util.regex.Pattern;

public class RegexChar {
//Example of Character class
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[abc]", "a"));
		System.out.println(Pattern.matches("[^abc]", "d"));
		System.out.println(Pattern.matches("[a-zA-Z]", "A"));
		System.out.println(Pattern.matches("[0-9]", "3"));

	}

}
