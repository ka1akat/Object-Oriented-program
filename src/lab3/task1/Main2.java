package lab3.task1;

public class Main2 {
	public static void main(String[] args) {
        Buildings b1 = new School("Zhibek zholy", 2);
        Buildings b2 = new University("KBTU", 5);
        
        b1.showInfo();
        b1.use();
        System.out.println("");
        b2.showInfo();
        b2.use();	
    }

}
