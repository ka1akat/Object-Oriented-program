package pr2.t1;

public class Student {

    private String name;
    private int id;

    public Student() {
        this.name = "Unknown";
        this.id = 0;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return name + " (id=" + id + ")";
    }
}

