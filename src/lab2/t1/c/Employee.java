package lab2.t1.c;

public class Employee extends Person{
	private String employeeId;
	public Employee(String name, int age, String employeeId) {
		super(name, age);
		this.employeeId = employeeId;
	}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;

        Employee e = (Employee) o;
        return employeeId.equals(e.employeeId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), employeeId);
    }
	

}


