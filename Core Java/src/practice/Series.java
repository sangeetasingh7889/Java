package practice;
//3,6,8,10,13,15,17,20,22,24,27,29
public class Series {

	public static void main(String[] args) {
		int n =3;
		System.out.println(n);
		for(int i=n; i<=29; i++)
		{
			 if(i%n==0)
			 {
				 n=n+3;
				 //System.out.println(n);
			 }else{
				 n=n+2;
				//System.out.println(n);
			 }System.out.println(n);
		}
	}
}
