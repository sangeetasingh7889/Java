package abstraction;

public class DisplayNamePrint extends NamePrint {
	
	@Override
	void display() {
		
		System.out.println(fname);
	}

	@Override
	void print() {
		System.out.println(lname);
	}

	public static void main(String[] args) {
		DisplayNamePrint dn = new DisplayNamePrint();
		dn.firstname("Sangeeta");
		dn.lastname("Kumari");
		dn.display();
		dn.print();
	}
}
