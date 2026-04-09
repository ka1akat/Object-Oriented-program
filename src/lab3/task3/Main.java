package lab3.task3;

public class Main {
	public static void main(String[] args) {
		MyCollection<String> coll = new MyListCollection<>();
		
        coll.add("Apple");
        coll.add("Banana");
        coll.add("Orange");
        
        System.out.println(coll.size());
        System.out.println(coll.contains("Apple"));
        System.out.println(coll.isEmpty());
        
        coll.remove("Banana");
        System.out.println(coll.size());
        coll.clear();
        System.out.println(coll.isEmpty());
        
        
	}

}
