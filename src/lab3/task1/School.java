package lab3.task1;

class School extends Buildings {

    public School(String name, int floors) {
        super(name, floors);
    }

    public void use() {
        System.out.println("Used for education");
    }
}
