package pr4.task4;

import java.util.Comparator;

public class MajorComp implements Comparator<Student> {
	
	public int compare(Student s1, Student s2){
		return s1.getMajor().compareTo(s2.getMajor());
	}

}
