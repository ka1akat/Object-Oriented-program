package SelfStudy.part4;
import java.util.Vector;
public class Students {
	private int Id;
	private String Name;
	private String Major;
	private Vector<String> Courses;
	
	public static Vector<Students> StudentList = new Vector<>();
	{
		StudentList.add(this);
	}
	public Students(int Id,String Name,String Major,Vector<String> Courses) {
		this.Id = Id;
		this.Name = Name;
		this.Major = Major;
		this.Courses = Courses;
	}
	
	public Students(int Id,String Name,String Major) {
		this(Id,Name,Major,new Vector<>()); 
	}
	
	public void addCours(String Courses) {
		this.Courses.add(Courses);
	}
	public int getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public String getMajor() {
		return Major;
	}
	public Vector<String> getCourses(){
		return Courses;
	}
	
	public String toString() {
		return "Student Id: " + Id +
				" Name: " + Name + 
				" Major: " + Major + 
				" Courses: " + Courses;
	}
}
