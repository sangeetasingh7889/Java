package regexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpre {

	public static void main(String[] args) {
		Pattern pat = Pattern.compile("....com");
		Matcher mat = pat.matcher("@$%^com");
		System.out.println(mat.matches());
		
		boolean b = Pattern.compile("...java").matcher("sanjava").matches();
		System.out.println(b);
		
		boolean bo = Pattern.matches(".", "sa");
		System.out.println(bo);

	}

}
