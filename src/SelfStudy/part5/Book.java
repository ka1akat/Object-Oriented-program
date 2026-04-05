package SelfStudy.part5;
public class Book {
	private String title;
	private int pages;
	private BookCategory extension;
	
	public Book(String title, int pages, BookCategory extension) {
		this.title = title;
		this.pages = pages;
		this.extension = extension;
	}
	
	public boolean equals(Object o){
		if (this == o) return true;
		if (!(o instanceof Book)) return false;
		
		Book b = (Book) o;
		return title.equals(b.title) && pages==b.pages && extension.equals(b.extension);
			
	}
	public int Hashcode() {
		return java.util.Objects.hash(title, pages, extension);
	}
	public String toString() {
		return "Title of book: " + title + " pages: " + pages + " " + extension;
	}

}
