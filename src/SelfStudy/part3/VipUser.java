package SelfStudy.part3;

import java.util.Vector;

public class VipUser extends User{
	
	public VipUser(int Id,String Name, String Email,Vector<String> PhoneNumbers) {
		super(Id,Name,Email,PhoneNumbers);
	}
	private String VipId;
	
	public VipUser(int Id,String Name, String Email, String VipId) {
		super(Id,Name,Email);
		this.VipId = VipId;
	}

	public void addNumber(String Number1){
		super.addNumber(VipId + Number1);	
	}
	public String toString(){
		return  super.toString();	
	}
	
	
	

}
