package Lec_6;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
   
	public static void PairSum(int [] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+ ", "+ arr[j]);
				}
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
     
     for(int i=0;i<n;i++) {
    	 System.out.print(arr[i]+" ");
     }
     
      //PairSum(arr, target);
     
	}

}
