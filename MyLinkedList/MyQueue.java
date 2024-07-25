package MyLinkedList;

import java.util.LinkedList;

public class MyQueue {
	
	LinkedList<Integer> ls;
	MyQueue(){
		ls= new LinkedList();
	}
	public void enqueue(int val) {
		
		ls.addLast(val);
	}
	public void dequeue() {
		
		ls.removeFirst();
	}
	public int front() {
		
		return ls.getFirst();
	}
	public int size() {
		
		return ls.size();
	}
}
