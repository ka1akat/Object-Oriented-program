package lab3.task3;

public interface MyCollection<A> {
	boolean add(A element);
	boolean remove(A element);
	boolean contains(A element);
	int size();
	boolean isEmpty();
	
	void clear();
	

}
