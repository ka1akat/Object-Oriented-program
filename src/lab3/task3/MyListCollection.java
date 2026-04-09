package lab3.task3;
import java.util.ArrayList;

public class MyListCollection<A> implements MyCollection<A> {
	
	private ArrayList<A> list = new ArrayList<>();
	
	public boolean add(A element) {
		list.add(element);
		return true;
	}
	public boolean remove(A element) {
		return list.remove(element);
	}
	
	public boolean contains(A element) {
		return list.contains(element);
	}
	public int size(){
		return list.size();
		
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
    public void clear() {
        list.clear();
    }

}
