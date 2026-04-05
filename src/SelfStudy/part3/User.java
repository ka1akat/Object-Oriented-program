package SelfStudy.part3;
import java.util.Vector;
public class User {
	private int Id;
	private String Name;
	private String Email;
	private Vector<String> PhoneNumbers;
	
	private static Vector<User> allUser = new Vector<>();
	
	{
		allUser.add(this);
	}
	
	public User(int Id,String Name, String Email,Vector<String> PhoneNumbers ) {
		this.Id = Id;
		this.Name = Name;
		this.Email = Email;
		this.PhoneNumbers = PhoneNumbers;
	}
	public User(int id, String name, String email) {
	    this(id, name, email, new Vector<>());
	}
	
	public void addNumber(String Number1) {
		this.PhoneNumbers.add(Number1);
	}
	public void addNumber(String Number1, String Number2) {
		this.PhoneNumbers.add(Number1);
		this.PhoneNumbers.add(Number2);
	}
	public int getId(){
		return Id;
	}
	public String getName(){
		return Name;
	}
	public String getEmail(){
		return Email;
	}
	public Vector<String> getPhoneNumbers(){
		return PhoneNumbers;
	}
	public Vector<User> getallUser(){
		return allUser;
	}
	public String toString(){
		return "User Id: "+ Id +
				" User Name: " + Name + " Email: " + Email + " Numbers: " + PhoneNumbers;		
	}

	
	

}
