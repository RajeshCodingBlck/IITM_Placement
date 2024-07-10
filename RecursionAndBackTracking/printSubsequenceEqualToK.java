package RecursionAndBackTracking;

import java.util.ArrayList;

public class printSubsequenceEqualToK {
     public static void printSubsequence (int [] arr, int i, ArrayList<Integer> ans
    		, int k, int sum) {
    	 
    	 
    	 if(i==arr.length) { 
    		 if(sum==k) {
    			 System.out.println(ans);
    		 }
    		 return;
    	 }
    	 
    	 if(sum>k) {
    		 return;
    	 }
    	 
    	 // i index vali value ko add karenge
    	 ans.add(arr[i]);
    	 printSubsequence(arr, i+1, ans, k,sum+arr[i]);
    	 ans.remove(ans.size()-1);
    	 // i index vali value ko add nahi karenge
    	 printSubsequence(arr, i+1, ans, k,sum+0);
    	 	 
     }
     
	public static void main(String[] args) {
		   
		
		
		}
	}

