package abstraction;

public class Product extends ProductInfo {

	public static void main(String[] args) {
		Product p = new Product();
		p.info2();
		p.info1();
	}

	@Override
	public void info2() {
		System.out.println("Call abstract method from non abstract class");
	}

}
