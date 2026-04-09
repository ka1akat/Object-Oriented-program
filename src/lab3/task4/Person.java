package lab3.task4;

public class Person {
	protected String name;
	
    public Person(String name) {
        this.name = name;
    }
    public Person(Person other) {
    	this.name = other.name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
    	this.name = name; 
    }
    
    public String toString() {
    	return "Person name " + name;
    }
    
    public boolean equals(Object o) {
    	if(this == o) return true;
    	if(!(o instanceof Person)) return false;
    	
    	Person person = (Person) o;
    	return name.equals(person.name);
    	
    }

}
