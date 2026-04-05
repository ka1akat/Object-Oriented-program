package SelfStudy.part7;
import java.util.Vector;

public class Product {
	private int Id;
	private String Name;
	private int Price;
	private Vector<String> categories;
	
	public static Vector<Product> AllProducts = new Vector<>();
	
	{
		AllProducts.add(this);
	}
	public Product(int Id,String Name,int Price,Vector<String> categories) {
		this.Id = Id;
		this.Name = Name;
		this.Price = Price;
		this.categories = categories;		
	}
	public Product(int Id,String Name,int Price) {
		this(Id, Name, Price, new Vector<>());		
	}
	public void addCategory(String c) {
		this.categories.add(c);
	}
	public String toString() {
		return "Id of product" + Id + " Name: " + Name + " Price: " + Price + " Categories: " + categories ;
	}
	
	

}
