package pr2.t2;
import java.util.Scanner;

import pr1.pr2_tr;
public class TimeTest {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int num = scan.nextInt();

        pr2_tr s = new pr2_tr(num);

        System.out.println(s.toString());
    
        scan.close();
    }
}
