package lab3.task5;
import lab3.task4.Employee;
import java.util.Date;

public class SortTest {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Mars", 45),
                new Chocolate("Snickers", 60)
        };

        Sort.bubbleSort(chocolates);

        System.out.println("");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        Time[] times = {
                new Time(12, 30, 10),
                new Time(9, 15, 5),
                new Time(12, 10, 20)
        };

        Sort.bubbleSort(times);

        System.out.println("");
        for (Time t : times) {
            System.out.println(t);
        }

        Employee[] employees = {
                new Employee("Alice", 3000, new Date(), "1"),
                new Employee("Bob", 5000, new Date(), "2"),
                new Employee("Charlie", 2000, new Date(), "3")
        };

        Sort.bubbleSort(employees);

        System.out.println("");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
