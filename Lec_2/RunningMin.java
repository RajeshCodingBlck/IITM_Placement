package Lec_2;

import java.util.Scanner;

public class RunningMin {

	
	public static int [] RunningMin(int [] arr) {
		
		int size= arr.length;
		int [] res= new int [size];
		
		for(int i=0; i<size;i++) {
			if(i==0) {
				res[i]=arr[0];
			}else {
				res[i]= Math.min(res[i-1], arr[i]);
			}
		}
		
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int size= s.nextInt();
      
      int [] arr= new int[size];
      
      for(int i=0; i<size;i++) {
    	  arr[i]= s.nextInt();
      }
       int [] res= RunningMin(arr);
       
       for(int i=0; i<res.length;i++) {
    	   System.out.print(res[i]+" ");
       }
      
      
	}

}
