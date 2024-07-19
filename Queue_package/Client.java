package Queue_package;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     
		MyQueue q= new MyQueue(5);
		
		q.enqueue(23);
		q.enqueue(45);
		q.enqueue(60);
		
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());
		
		System.out.println(q.isEmpty());
		q.enqueue(67);
		q.enqueue(78);
		
		q.enqueue(90);
		
		
		
		
		
	}

}
