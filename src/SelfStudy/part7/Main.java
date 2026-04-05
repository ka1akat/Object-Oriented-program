package SelfStudy.part7;
import java.util.Vector;
public class Main {
	public static void main(String[] args) {
		Vector<String> Categories = new Vector<>();
		Categories.add("Apple");
		
		Product p1 = new Product(1, "Laptop", 500,Categories);
		p1.addCategory("Bread");
		PremiumProduct p2 = new PremiumProduct(2, "Phone", 300 ,"Limited");
		p2.addCategory("Vegetables");
		
		for(Product p : Product.AllProducts) {
			System.out.println(p);
			
		}
		
		
	}

}
