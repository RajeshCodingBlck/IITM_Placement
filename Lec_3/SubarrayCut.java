package Lec_3;

public class SubarrayCut {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,-2,3,4};
     
     int OverallMaxSum=Integer.MIN_VALUE;
     
     
     for(int s=0; s<arr.length;s++) {
    	 
    	 for(int e=s;e< arr.length;e++) {
    		 
    		 System.out.println("Cut is from "+ s+" "+e);
    		 
    		 // Print the subrray
    		 int currSubarraySum=0;
    		 for(int k=s; k<=e;k++) {
    			 System.out.print(arr[k]+" ");
    			 currSubarraySum=currSubarraySum+ arr[k];
    		 }
    		 if(OverallMaxSum< currSubarraySum) {
    			 OverallMaxSum =currSubarraySum;
    		 }
    		 System.out.println(" Sum is "+currSubarraySum);
    	 }
     }
     
     System.out.println(OverallMaxSum);
	}

}
