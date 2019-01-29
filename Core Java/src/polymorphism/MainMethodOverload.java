package polymorphism;

public class MainMethodOverload {

	public static void main(int[] args) {
		System.out.println("First");
	}
	public static void main(String args) {
		System.out.println("Second");
	}
	public static void main(String[] args) {
		System.out.println("Third");
//		main("java");
		/*String str[] = {"java","C++","Php"};
		main(str);// It will go in infinite loop*/
	}

}
