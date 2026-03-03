package lab1.t4;

import java.util.ArrayList;
import pr2.t1.Student;

public class GradeBook {

    private Course course;
    private ArrayList<Student> students;
    private ArrayList<Integer> grades; 
    
    
    public GradeBook() {
        this.course = new Course();
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
        grades.add(null); 
    }

    public int getStudentsCount() {
        return students.size();
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void setGrade(int index, int grade) {
        grades.set(index, grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
        System.out.println(course);
        System.out.println();
    }

    public void displayGradeReport() {
        System.out.println("\n Grade Report");

        double avg = determineClassAverage();
        int max = getMaxGrade();
        int min = getMinGrade();

        Student best = getStudentWithGrade(max);
        Student worst = getStudentWithGrade(min);

        System.out.printf("Class average is: %.2f%n", avg);

        if (best != null) System.out.println("Highest grade is " + max );
        if (worst != null) System.out.println("Lowest grade is " + min );

        System.out.println();
        outputLetterGradeStats();

        System.out.println();
        outputBarChart();
    }

    private double determineClassAverage() {
        int sum = 0;
        int count = 0;

        for (Integer g : grades) {
            if (g != null) {
                sum += g;
                count++;
            }
        }
        if (count == 0) return 0;
        return (double) sum / count;
    }

    private int getMaxGrade() {
        int max = -1;
        for (Integer g : grades) {
            if (g != null && g > max) max = g;
        }
        return max;
    }

    private int getMinGrade() {
        int min = 101;
        for (Integer g : grades) {
            if (g != null && g < min) min = g;
        }
        return min;
    }

    private Student getStudentWithGrade(int target) {
        for (int i = 0; i < grades.size(); i++) {
            Integer g = grades.get(i);
            if (g != null && g == target) {
                return students.get(i);
            }
        }
        return null;
    }

    private void outputLetterGradeStats() {
        int a = 0, b = 0, c = 0, d = 0, f = 0;

        for (Integer g : grades) {
            if (g == null) continue;

            if (g >= 90) a++;
            else if (g >= 80) b++;
            else if (g >= 70) c++;
            else if (g >= 60) d++;
            else f++;
        }

        System.out.println("Letter grade distribution:");
        System.out.println("A (90-100): " + a);
        System.out.println("B (80-89):  " + b);
        System.out.println("C (70-79):  " + c);
        System.out.println("D (60-69):  " + d);
        System.out.println("F (0-59):   " + f);
    }

    private void outputBarChart() {
        int[] freq = new int[11]; 
        for (Integer g : grades) {
            if (g == null) continue;

            if (g == 100) freq[10]++;
            else freq[g / 10]++;
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < freq.length; i++) {
            if (i == 10) {
                System.out.print("100:   ");
            } else {
                int start = i * 10;
                int end = start + 9;
                System.out.printf("%02d-%02d: ", start, end);
            }

            for (int star = 0; star < freq[i]; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook{course=" + course + ", students=" + students.size() + "}";
    }
}