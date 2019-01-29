package learn.thiskeyword;


//This keyword representing current class instanc variables
public class Bike {
	private int price;
	private String brand;
	public Bike(int p, String b) {
		price = p;
		brand = b;
	
		
	}
	
	/*public Bike(int price, String brand) {
		this.price = price;
		this.brand = brand;
		
		price = this.price;//0
		//this.brand = this.brand;//null
		//this.brand = brand;//Honda
		System.out.println(this.brand);//honda
		brand = this.brand;//null
		System.out.println(brand);
		
	}*/
	
	public void getInfo() {
		System.out.println(brand+"  "+price);
	}
	
	public static void main(String[] args) {
		Bike b = new Bike(50000, "Honda");
		b.getInfo();
	}

}
