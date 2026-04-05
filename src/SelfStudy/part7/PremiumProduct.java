package SelfStudy.part7;

import java.util.Vector;

public class PremiumProduct extends Product {
	private String Plus;
	public PremiumProduct(int Id,String Name,int Price,String Plus) {
		super(Id, Name, Price);
		this.Plus = Plus;
	}
	
	public void addCategory(String c) {
		super.addCategory(Plus + c );
	}
	public String toString() {
		return super.toString();
	}
}
