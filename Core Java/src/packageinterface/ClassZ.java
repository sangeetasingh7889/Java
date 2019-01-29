package packageinterface;

public class ClassZ implements InterfaceY {

	public static void main(String[] args) {
		ClassZ cz = new ClassZ();
		cz.xmm();
		cz.ymm();

	}

	@Override
	public void xmm() {
		System.out.println("Method of InterfaceX");
		
	}

	@Override
	public void ymm() {
		System.out.println("Method of InterfaceY");
		
	}

}
