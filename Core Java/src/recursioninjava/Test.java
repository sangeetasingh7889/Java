package recursioninjava;

public class Test {
	static int count=0;
	public static void main(String[] args) {
		count++;
		System.out.println("Main Called: "+count);
		String arr[]= {"Java","Php"};
		main(arr);
	}

}
