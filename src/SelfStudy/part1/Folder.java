package SelfStudy.part1;
import java.util.HashSet;

public class Folder {
	private HashSet<Document> documents;
	private String name;
	
	public Folder(String name) {
		this.name = name;
		this.documents = new HashSet<>();
	}
	public void add(Document d) {
		documents.add(d);				
	}
	public void printDocuments() {
		for(Document d : documents) {
			System.out.println(d);
		}
	}

}
