package SelfStudy.part1;

public class Document {
	private String title;
	private long size;
	private Extention extention;
	
	public Document(String title,long size,Extention extention) {
		this.title = title;
		this.size = size;
		this.extention = extention;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)return true;
		if (!(o instanceof Document)) return false;
		
		Document d = (Document) o;
		return size == d.size && title.equals(d.title) && extention.equals(d.extention);
			
	}
	@Override
	public int hashCode() {
		return java.util.Objects.hash(title, size,extention);
	}
	public String toString(){
		return title + " " + size + " " + extention; 
	}
	

}
