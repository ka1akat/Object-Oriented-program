package pr5.task3_1;
import java.io.Serializable;

public class Book implements Serializable {
	private String title;
	private String author;
	private transient int visitCount;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.visitCount = 0;
	}
	
	public String getTitle() {
		return title;
	}
	public String gerAuthor() {
		return author;
	}
	public int getVisitCount(){
		return visitCount;
	}
    public void visit() {
    	visitCount++;
    }
    public String toString() {
    	return  "Title: " + title + ", Author: " + author + ", Visit count: " + visitCount;
    }
	
	

}
