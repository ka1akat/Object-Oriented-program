package SelfStudy.part4;
import java.util.Vector;
public class Main {
	public static void main(String[] args) {
		Vector<String> Courses = new Vector<>();
		Courses.add("ML");
		Students s1 = new Students(1,"Karakat","IS",Courses);	
		s1.addCours("OOP");
		Graduated s2 = new Graduated(2,"Altosh","IS",Courses,"A");	
		s2.addCours("Web");
		
		System.out.println("All students: " + Students.StudentList);
	}

}
