package PriorityQueue_pkg;
import java.util.ArrayList;

public class MyPriorityQueue {

	
	ArrayList<Integer> arr;
	MyPriorityQueue(){
		
		arr= new ArrayList();
	}
	
	// pi is parent index 
	// ci is Child Index
	private int ParentIndex(int ci) {  // ci Child Index
		
		int pi = (ci-1)/2;
		return pi;
	}
	
	private int leftChild(int pi) {
		
		return 2*pi +1;
	}
	
	private int rightChild(int pi) {
		
		return 2*pi +2;
	}
	
	public void add(int val) {
		
		arr.add(val);
		
		upheapify(arr.size()-1);
		
	}

	private void swap(int pi, int ci) {
		
		int temp= arr.get(pi);
		arr.set(pi, arr.get(ci));
		arr.set(ci, temp);
		
	}
	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		
		if(ci==0) {
			return;
		}
	   int pi=ParentIndex(ci); 
	   if(arr.get(pi)> arr.get(ci)) {
		   swap( pi, ci);
		   upheapify(pi);
	   }
	   
	}
	
	public int peek() throws Exception {
		
		if(arr.size()==0) {
			 throw new Exception(" PriorityQueue is Empty");
		}
		
		return arr.get(0);
		
	}
	
	public void remove() {
		
		
		swap(0, arr.size()-1);
		arr.remove(arr.size()-1);
		
		downheapify(0);
		
	}

	private void downheapify(int pi) {
		
		
		
		int leftChildIndex= leftChild(pi);
		int rightChildIndex= rightChild(pi);
		
		if(leftChildIndex >= arr.size( ) && rightChildIndex >= arr.size()) {
			return;
		}
		
		int minValueIndex=pi;
		
		if(leftChildIndex< arr.size() &&  arr.get(minValueIndex) > arr.get(leftChildIndex)) {
			minValueIndex=leftChildIndex;
		}
		
		if(rightChildIndex < arr.size() && arr.get(minValueIndex) > arr.get(rightChildIndex))
		{
			minValueIndex=rightChildIndex;
		}
		
		if(minValueIndex !=pi) {
			
			swap(minValueIndex, pi);
			downheapify(minValueIndex);
		}
		
	}
	
}
