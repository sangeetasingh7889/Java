package learn.thiskeyword;

public class ThisKeywordInfiniteLoop {
	private String name = "facebook";
	
	public ThisKeywordInfiniteLoop(String name) {
		this.name = name;
		ThisKeywordInfiniteLoop t = new ThisKeywordInfiniteLoop("Yahoo");
	}
	void getsms()
	{
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) {
		ThisKeywordInfiniteLoop t = new ThisKeywordInfiniteLoop("Google");
		t.getsms();
	}

}
