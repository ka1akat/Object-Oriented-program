package SelfStudy.part5;
import java.util.HashSet;
public class Library {
	private String name;
	private HashSet<Book> Books;
	
	public Library(String name) {
		this.name = name;
		this.Books = new HashSet<>(); 
	}
	public void add(Book b){
		Books.add(b);
	}
	public void printBook(){
		for(Book b:Books) {
			System.out.println(b);
		}
		
	}
	


	

}
