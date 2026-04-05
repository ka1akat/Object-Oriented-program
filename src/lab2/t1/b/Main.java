package lab2.t1.b;

public class Main {
	public static void main(String[] args) {
		Book b = new Book("Java Programming", "John Smith", 2022, 350);
		System.out.println(b);
		System.out.println(b.getAuthor());
		b.setAuthor("Arman");
		System.out.println(b);
	}

}
