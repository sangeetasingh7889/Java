package basic;

public class Facebook {
	Gmail gmail;
	String pwd;
	Facebook(Gmail gmail, String pwd)
	{
		this.gmail=gmail;
		this.pwd=pwd;
	}
	void getlogin()
	{
		System.out.println("Login= " + gmail.gid+ " " +pwd);
	}
	public static void main(String[] args) {
		Gmail gm = new Gmail("Sangeeta", "Sang12@");
		Facebook fb = new Facebook(gm,"Sang123@");
		fb.getlogin();

	}

}
