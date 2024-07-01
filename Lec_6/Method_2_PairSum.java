package Lec_6;

import java.util.Arrays;
import java.util.Scanner;

public class Method_2_PairSum {

	public static void PairSum(int [] arr, int target) {
		
		int i=0;
		int j= arr.length-1;
		
		while(i<j) {
			
			int sum= arr[i]+arr[j];
			
			if(sum> target) {
				j--;
				
			}else if(sum<target) {
				i++;
			}else {
				
				System.out.println(arr[i]+" , "+arr[j]);
				i++;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	     // Size of Array
	     int n= s.nextInt();
	     
	     int [] arr= new int[n];  // Create the Array
	     for(int i=0; i<n;i++) { // Taking element of Array
	    	 arr[i]=s.nextInt();
	     }
	     
	     int target= s.nextInt(); // Target Value ka Input
	     
	     Arrays.sort(arr);
	     PairSum(arr, target);
	}

}
