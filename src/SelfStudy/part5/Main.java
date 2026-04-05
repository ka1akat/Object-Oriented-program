package SelfStudy.part5;

public class Main {
	public static void main(String[] args) {
		Book b = new Book("OOP Basics", 300, BookCategory.EDUCATION);
		Library l = new Library("KBTU Library");
		l.add(b);
		l.printBook();
		
	}

}
