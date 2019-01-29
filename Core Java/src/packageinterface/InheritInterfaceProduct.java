package packageinterface;

public class InheritInterfaceProduct implements InterfaceProduct {
	{
		System.out.println("Heading is: "+ inf);
	}

	public static void main(String[] args) {
		InterfaceProduct ip = new InheritInterfaceProduct();
		ip.colour();
		ip.price();
		ip.type();
		System.out.println(ip.name);
		System.out.println(ip.age);
		
	}

	@Override
	public void colour() {
		String col = "Pink";
		System.out.println("Colour of Product is: " + col);
	}

	@Override
	public void price() {
		int price = 1000;
		System.out.println("Price of Product is: " + price);
	}

	@Override
	public void type() {
		String type = "Pen";
		System.out.println("Type of Product is: " + type);		
	}

}
