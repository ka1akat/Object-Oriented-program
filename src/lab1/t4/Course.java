package lab1.t4;

public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisites; // List<Course>

    public Course() {
        this("Unknown", "No description", 0, "None");
    }

    public Course(String name, String description, int credits, String prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }
    
    public Course(String name , String description) {
    	this.name = name;
    	this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', description='" + description + "', credits=" + credits +
                ", prerequisites='" + prerequisites + "'}";
    }
}