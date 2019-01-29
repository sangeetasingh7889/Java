package basic;

public class Block {
	
	{
		/*System.out.println("It define inside class but outside method constructor, block");
		System.out.println("It execute when object create");
		System.out.println("If we define any constructor and instance block in a class then first block will be executed");*/
		System.out.println("Block will be execute");
	}
	static{
		System.out.println("With static Object");
	}
	Block()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		Block b = new Block();
		Block a = new Block();
		Block c = new Block();
		Block d = new Block();

	}

}
