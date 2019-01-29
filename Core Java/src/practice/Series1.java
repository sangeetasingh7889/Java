package practice;

public class Series1 {
	//3,6,8,10,13,15,17,20,22,24,27,29

	public static void main(String[] args) {
		int n=3;
		int temp=0;
		System.out.println(n);
		for(int i=0;i<7;i++)
		{
			if(temp==0)
			{
				n=n+3;
				temp++;
				System.out.println(n);
			}
			if(temp>=0)
			{
				n=n+2;
				temp++;
				System.out.println(n);
				if(temp>2)
				{
					temp=0;
				}
			}
		}

	}

}
