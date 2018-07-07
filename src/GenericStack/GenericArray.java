package GenericStack;

import java.util.LinkedList;

public class GenericArray<T> {
	private LinkedList<T> stackInteger = new LinkedList<>();
	
	public void put(int index,T item) {
		stackInteger.add(index, item);
	}
	public T get(int index) {
		
		return stackInteger.remove(index);
	}
	

}
