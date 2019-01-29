package packageinterface;

public abstract class Child implements InterfaceParent {
	abstract void cmm();
	@Override
	public void pmm() {
		System.out.println("Method of InterfaceParent inherited in abstract class Child");
		
	}

}
