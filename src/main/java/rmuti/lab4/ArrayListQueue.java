package rmuti.lab4;

import java.util.ArrayList;

public class ArrayListQueue {
	private ArrayList lst;
	
	public ArrayListQueue() {
		lst = new ArrayList();
	}
	
	public Object peek() {
		return lst.get(0);
		}
	
	public Object dequeue() {
		Object obj = lst.get(0);
		lst.remove(0);
		return obj;
	}
	
	public void enqueque(Object e) {
		lst.add(e);
	}
	
	public String toString() {
		return lst.toString();
	}
	
}
