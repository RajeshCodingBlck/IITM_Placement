package PriorityQueue_pkg;

public class client {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
     MyPriorityQueue pq= new MyPriorityQueue();
     
     pq.add(34);
     pq.add(12);
     pq.add(5);
     System.out.print(pq.peek());
     System.out.println();
     pq.remove();
     System.out.print(pq.peek());
	}

}
