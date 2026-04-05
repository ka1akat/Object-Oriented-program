package pr4.task4;

public class Student implements Comparable<Student>{
	public String name;
	public double gpa;
	public String major;
	
	public Student(String name, double gpa,String major) {
		this.name = name;
		this.gpa = gpa;
		this.major = major;			
	}
	
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}
	
	public String getMajor() {
		return major;
	}

	public int compareTo(Student other) {
		return Double.compare(this.gpa, other.gpa);
	}
	
	public String toString() {
		return name + " " + gpa + " " + major;
	}
	

}
