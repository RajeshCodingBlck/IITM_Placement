package Wrapper_demo;

import java.util.ArrayList;

public class ArrayLisr_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> arr= new ArrayList();
      
      
      System.out.println(arr);
      
      // Add 
      arr.add(34);
      //System.out.println(arr);
      arr.add(56);
      //System.out.println(arr);
      
      arr.add(0,12);
      //System.out.println(arr);
      //arr.add(4,12);
      System.out.println(arr);
     
      // Remove
//      arr.remove(3);
//      System.out.println(arr);
      
      // Update
      arr.set(2, 50);
      System.out.println(arr);
      
      System.out.println(arr.size());
      
      System.out.println(arr.get(2)); // Read the i index value
      
      // Traversal
      // for loop
      for(int i=0; i< arr.size();i++) {
    	  
    	  System.out.println(arr.get(i));
      }
      
      for( Integer  val : arr) {
    	  System.out.println(val);
      }
      
      
      
      
	}

}
