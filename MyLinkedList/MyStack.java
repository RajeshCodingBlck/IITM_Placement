package MyLinkedList;

import java.util.LinkedList;

public class MyStack {
	
	LinkedList<Integer> ls;
	
	MyStack(){
		ls= new LinkedList();
	}
	
	public void push(int val) {
		
		ls.addLast(val);	
	}
	
	public void pop() {
		
		if(ls.size()==0) {
			
		}
		ls.removeLast();
	}
	
	public int peek() {
		
		return ls.getLast();
	}
	
	public int size() {
		
		return ls.size();
	}
	

}
