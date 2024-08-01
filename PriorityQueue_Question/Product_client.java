package PriorityQueue_Question;

import java.util.*;

class cmp1 implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		
		if(o1.price< o2.price) {
			return -1;
		}else {
			return 1;
		}
	}
	
	
}
public class Product_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		PriorityQueue<Product> pq= new PriorityQueue();
//		
//		Product p1= new Product(10000, 3, "Redmi");
//		Product p2= new Product(30000, 4, "Samsung");
//		Product p3= new Product(2000, 5, "Apple");
//		Product p4= new Product(60999, 5, "Nokia");
//		
//		pq.add(p1);
//		pq.add(p2);
//		pq.add(p3);
//		pq.add(p4);
//		
//		System.out.println(pq.peek().brand);
		
		Product p1= new Product(10000, 3, "Redmi");
		Product p2= new Product(10000, 3, "Redmi");
//		Product p2= p1;
		HashMap<Product, Integer> m= new HashMap();
		m.put(p1, 1);
		m.put(p2, 1);
		
		System.out.println(m.size());
		
		
		
		
	}

}
