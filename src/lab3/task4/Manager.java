package lab3.task4;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public Manager(Manager other) {
        super(other);
        this.bonus = other.bonus;
        this.team = new Vector<>();

        for (Employee employee : other.team) {
            this.team.add(employee.clone());
        }
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team;
    }

    public void addToTeam(Employee employee) {
        team.add(employee);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public String toString() {
        return "Manager" +
                "name='" + name + '\'' +
                ", salary=" + getSalary() +
                ", hireDate=" + getHireDate() +
                ", insuranceNumber='" + getInsuranceNumber() + '\'' +
                ", bonus=" + bonus +
                ", team=" + team;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager m = (Manager) o;
        return bonus == m.bonus && team.equals(m.team);
    }


    public Manager clone() {
    	return new Manager(this);
    }
}
