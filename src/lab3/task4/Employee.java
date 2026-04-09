package lab3.task4;
import java.util.Date;
public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;
    
    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }
    
    public Employee(Employee other) {
        super(other);
        this.salary = other.salary;
        this.hireDate = new Date(other.hireDate.getTime());
        this.insuranceNumber = other.insuranceNumber;
    }
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
    	this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = new Date(hireDate.getTime());
    }
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public String toString() {
        return "Employee:" + "name='" + name +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", insuranceNumber='" + insuranceNumber;
    }
	
    public boolean equals(Object o){
    	if (this == o) return true;
    	if(!(o instanceof Employee)) return false;
    	if (!super.equals(o)) return false;
    	
    	Employee e = (Employee) o;
    	return salary == e.salary && hireDate.equals(e.hireDate) && insuranceNumber.equals(e.insuranceNumber);
    }
    
    public int compareTo(Employee other) {
    	if(other == null) {
    		return 1;
    	}
    	int result = Double.compare(this.salary, other.salary);
    	
        if (result != 0) { //if not equal
            return result; 
        }
        
        if (this instanceof Manager && other instanceof Manager) {
            Manager m1 = (Manager) this;
            Manager m2 = (Manager) other;
            return Double.compare(m1.getBonus(), m2.getBonus());
        }

        return 0;
        
    }
    
    public Employee clone() {
        return new Employee(this);
    }

}
