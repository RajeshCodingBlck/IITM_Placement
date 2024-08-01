package PriorityQueue_Question;

import java.util.Comparator;
import java.util.PriorityQueue;

class cmp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		if(o1>o2) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		PriorityQueue<Integer> pq= new PriorityQueue( new cmp());
		
		int [] arr= {10,2,1,4,3,20,12};
		
		for(int i=0; i<arr.length;i++) {
			
			pq.add(arr[i]);
		}
		int index=0;
		while(pq.size()>0) {
			
			arr[index++]= pq.remove();
//			index++;
			
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
