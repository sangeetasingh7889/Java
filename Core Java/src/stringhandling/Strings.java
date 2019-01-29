package stringhandling;

public class Strings {

	public static void main(String[] args) {
		//By String Literal
		
		String s1 = "Hello";
		s1.concat("Sangeeta");
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Sangeeta");
		System.out.println(sb);
		
		StringBuilder sbuild = new StringBuilder("Hello");
		sbuild.append("Sangeeta");
		System.out.println(sbuild);

		String s2 ="Hello";
		s2=s2.concat("Sangeeta");
		System.out.println(s2);
		
		String s3 ="Hello";
		String s4 =s3.concat("Sangeeta");
		System.out.println(s4);
		
		String s5 ="Hello";
		System.out.println(s5.concat("Sangeeta"));
		
		String s6 = new String("Hello");
		s6.concat("Sangeeta");
		System.out.println(s6);
	}

}
