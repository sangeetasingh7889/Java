package packageinterface;

public class User extends Child {

	public static void main(String[] args) {
		User us = new User();
		us.pmm();
		us.cmm();
	}

	@Override
	void cmm() {
		System.out.println("Method of Child Class is inherited in User Classs");
		
	}

}
