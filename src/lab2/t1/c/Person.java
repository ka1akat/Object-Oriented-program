package lab2.t1.c;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "Name: " + name + ", age: " + age;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Person)) return false;
		
		Person p = (Person) o;
		return name.equals(p.name) && age == p.age;
	}
	public int hashCode() {
		return java.util.Objects.hash(name, age);
	}

}
