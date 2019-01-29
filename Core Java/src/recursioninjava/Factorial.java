package recursioninjava;

public class Factorial {
	
	public static int findFact(int n) {
		if(n<=1) {
			return n;
		}else
			return n*findFact(n-1);
	}
	
	public static void main(String[] args) {
		int n=5;
		int ans = Factorial.findFact(n);//call by value
		System.out.println(ans);
		
	}
	

}
