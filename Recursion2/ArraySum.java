package Recursion2;

public class ArraySum {
    
	// Define :- i index se Start hone value array ka sum de raha he..
	public static int getSum(int [] arr, int i) {
		  
		  if(i==arr.length) {
			  return 0;
		  }
		 int chhota_sum= getSum(arr, i+1);
		 int mera_sum= chhota_sum+ arr[i];
		 return mera_sum;
		   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] arr= {1,2,10,3,4,5};
          int ans=getSum( arr, 0);
          System.out.println(ans);
	}

}
