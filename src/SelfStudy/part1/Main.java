package SelfStudy.part1;

public class Main {
	public static void main(String[] args) {
		
		 Document d1 = new Document("lab7", 200, Extention.DOC);
		 Folder f = new Folder("labs");
		 f.add(d1);
		 f.printDocuments();
		
	}

}
