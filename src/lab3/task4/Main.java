package lab3.task4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    	Employee e1 = new Employee("Alice", 3000, new Date(120, 5, 10), "INS001");
        Employee e2 = new Employee("Bob", 3500, new Date(119, 3, 15), "INS002");
        Employee e3 = new Employee("Charlie", 3000, new Date(121, 7, 20), "INS003");

        Manager m1 = new Manager("David", 5000, new Date(118, 1, 5), "INS004", 1000);
        Manager m2 = new Manager("Eva", 5000, new Date(117, 10, 25), "INS005", 1500);
        
        m1.addToTeam(e1);
        m1.addToTeam(e2);

        m2.addToTeam(e2);
        m2.addToTeam(e3);
        
        System.out.println(e1);
        System.out.println(m1);
        
        System.out.println("");
        Employee e1Copy = new Employee("Alice", 3000, new Date(120, 5, 10), "INS001");
        System.out.println("e1 equals e1Copy: " + e1.equals(e1Copy));
        System.out.println("m1 equals m2: " + m1.equals(m2));
        
        System.out.println("");
        System.out.println("e1 compareTo e2: " + e1.compareTo(e2));
        System.out.println("m1 compareTo m2: " + m1.compareTo(m2));
        
        List<Employee> list1 = new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
        list1.add(m1);
        list1.add(m2);
        
        System.out.println("");
        System.out.println("Sorting by name");
        Collections.sort(list1);
        for (Employee e : list1) {
            System.out.println(e);
        }
        
        System.out.println("");
        Collections.sort(list1, new HireDateComparator());
        for (Employee e : list1) {
            System.out.println(e);
        }
        
        Employee clonedEmployee = e1.clone();
        Manager clonedManager = m1.clone();
        System.out.println("");
        System.out.println("Original employee: " + e1);
        System.out.println("Cloned employee:   " + clonedEmployee);

        System.out.println("Original manager: " + m1);
        System.out.println("Cloned manager:   " + clonedManager);
        
        System.out.println("");
        System.out.println("Deep cloning test for Manager");
        clonedManager.getTeam().get(0).setName("ChangedName");

        System.out.println("Original manager:");
        System.out.println(m1);

        System.out.println("Cloned manager:");
        System.out.println(clonedManager);
        
        
        
    	
    	
    }
	

}
