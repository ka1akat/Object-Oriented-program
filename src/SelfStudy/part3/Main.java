package SelfStudy.part3;
import java.util.Vector;
public class Main {
	public static void main(String[] args) {
		Vector<String> nums = new Vector<>();
		nums.add("+77074199313");
		
		User u1 = new User(1, "Aruzhan", "a@gmail.com", nums);
		u1.addNumber("+87075645414");
		u1.addNumber("+87025645414");
		
		User u2 = new VipUser(2, "ALtosh", "k@gmail.com", "Gold");
		u2.addNumber("+87025645414");
		u2.addNumber("+0098765");
		
		System.out.println(u1);
		System.out.println(u2);
		
		
		
	}

}
