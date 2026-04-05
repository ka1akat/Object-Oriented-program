package SelfStudy.part4;

import java.util.Vector;

public class Graduated extends Students {
	private String Grade; 
	public Graduated(int Id,String Name,String Major,Vector<String> Courses,String Grade) {
		super(Id, Name, Major, Courses);
		this.Grade = Grade;
	}
	public void addCours(String Courses) {
		super.addCours(Courses + "passed succesfully");
	}
	public String toString() {
		return "Student grade: " + Grade + " " +super.toString() ;
	}
	

}
