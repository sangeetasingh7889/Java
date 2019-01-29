package packageinterface;

public interface InterfaceProduct {	
	public String name="Sangeeta";
	public int age=12;
	
	String inf = "Information of Product";
	void colour();
	abstract void   price();
	public  abstract  void type();
	
	default void mm(){
		System.out.println("Default method");
	}
}
