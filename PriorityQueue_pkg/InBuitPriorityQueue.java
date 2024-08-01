package PriorityQueue_pkg;
import java.util.PriorityQueue;

public class InBuitPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		PriorityQueue<Integer> pq= new PriorityQueue();
		
		pq.add(12);
		pq.add(34);
		pq.add(10);
		pq.add(37);
		
		System.out.println(pq.peek());
		//System.out.println(pq.remove());
		System.out.println(pq.peek());
		
		System.out.println(pq.size());
		
		System.out.println(pq);
		
		
	}

}
