package pr1;

public class pr2_stud {

    private String name;
    private String id;
    private int yearOfStudy;

    public pr2_stud(String name, String id, Integer yearOfStudy) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy; 
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }
    
    

    public int getYearOfStudy() {
        return yearOfStudy;
    }
}