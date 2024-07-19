package Queue_package;

public class MyQueue {

	private int[] arr;
	private int front; // index of front element of Queue
	private int rear;  // index of last element of Queue
	
	MyQueue(int size){
		
		arr= new int[size];
		front=-1;
		rear=-1;
	}
	
	// Behaviour
	// add
	public boolean isEmpty() {
		
		if(front==-1 && rear==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public boolean isfull() {
		
		
		// Linear Array
//		if(rear== arr.length-1) {
//			return true;
//		}else {
//			return false;
//		}
		
//		circular Array
		
		if((rear+1)%arr.length ==front) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void enqueue(int val) throws Exception {
		
		if(isfull()) {
			throw new Exception("Queue is Overflow");
		}else if(isEmpty()) {
			
			// Linear Array
//			front++;
//			rear++;
			
			// Circular Array
			front= (front+1)%arr.length;
			rear= (rear+1)%arr.length;
			arr[rear]=val;
		}else {
			//rear++;
			rear= (rear+1)%arr.length;
			arr[rear]=val;
		}

		
	}
	
	public void dequeue() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}else if(front==rear) {
			
			front=-1;
			rear=-1;
		}else {
//			front++;
			
			
			front= (front+1)%arr.length;
			
		}
		
		
	}
	public int front() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return arr[front];
	}
	
	

}
