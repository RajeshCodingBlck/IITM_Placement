package Lec_4;

import java.util.Scanner;

public class Missing_number {
  
	public static int missingNumber(int[] nums) {
	    
	      int n= nums.length;
	      int sum_of_range= (n*(n+1))/2;
	      int sum=0;
	      for(int i=0; i<n;i++){
	        sum=sum+nums[i];
	      }

	      int missing_number= sum_of_range- sum;
	      return missing_number;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       int [] nums= new int[n];
       for(int i=0; i<n;i++) {
    	   nums[i]= s.nextInt();
       }
       
       int ans= missingNumber(nums);
       System.out.println(ans);
       
	}

}
