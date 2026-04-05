package lab2.t1.b;

public class Book extends LibraryItem{
	private int numberOfPage;
	public Book(String title, String author,int publicationYear, int numberOfPage ) {
		super(title,author,publicationYear);
		this.numberOfPage = numberOfPage;
	}
	@Override
	public String toString() {
	    return super.toString() + " Pages: " + numberOfPage;
	}

}
