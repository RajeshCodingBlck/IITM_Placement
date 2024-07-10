package RecursionAndBackTracking;

import java.util.ArrayList;

public class printSubsequenceOfArray {
  
	public static void printSubsequence(int [] arr, int i, ArrayList<Integer> ans) {
		
	     if(i==arr.length) {
	    	
	    	// System.out.println(ans);
	    	 
//	    	 int sum=0;
//	    	 for(int val : ans) {
//	    		 sum+=val;
//	    	 }
//	    	  if(sum==4) {
//	    		  System.out.println(ans);
//	    	  }
	    	 return;
	     }
		
		
		//  i index vali value ak include nahi karenge
			 printSubsequence(arr, i+1, ans);
		//  i index vali value ak include karenge
		 ans.add(arr[i]);
		 printSubsequence(arr, i+1, ans);
	     ans.remove(ans.size()-1);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4};
      ArrayList<Integer> ans= new ArrayList();
      printSubsequence(arr,0,ans);
	}

}
