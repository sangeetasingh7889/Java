package stringhandling;

public class Compare {

	public static void main(String[] args) {
	 String s1 = new String("Sangeeta");
	 String s2 = new String("sangeeta");
	 String x = new String("sangeeta");
	 System.out.println(x=s2);
	 System.out.println(x.equals(s2));
	 System.out.println(s1==s2);
	 System.out.println(s1.equals(s2));
	 System.out.println(s1.equalsIgnoreCase(s2));
	 
	 String s3 = "Sangeeta";
	 String s4 = "sangeeta";
	 String s5 = "sangeeta";
	 System.out.println(s3==s4);
	 System.out.println(s4==s5);
	 System.out.println(s4.equals(s5));
	 
	 System.out.println(s3.compareTo(s4));
	 System.out.println(s4.compareTo(s3));
	 System.out.println(s4.compareTo(s5));
	}

}
