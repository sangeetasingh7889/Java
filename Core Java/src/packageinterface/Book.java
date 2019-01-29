package packageinterface;

public class Book implements BookType, BookInfo, BookPublisher {

	public static void main(String[] args) {
		Book b = new Book();
		b.typ();
		b.info();
		b.publish();
	}

	@Override
	public void typ() {
		System.out.println("Type of Book is Java");
	}

	@Override
	public void info() {
		System.out.println("It is a Core Java Book");
	}

	@Override
	public void publish() {
		System.out.println("Published by JavaTPoint");
	}
}
