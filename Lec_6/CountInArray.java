package Lec_6;

import java.util.Arrays;
import java.util.Scanner;

public class CountInArray {
  
	public static void countInArray(int [] arr1, int [] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int count=0;
		int j=0;
		for(int i=0;i<arr1.length;i++) {	
			for(; j<arr2.length;j++) {
				
				if(arr1[i]>arr2[j]) {
					count++;
				}else {
					break;
				}
			}
			System.out.println(arr1[i]+ " -> "+ count);
			//count=0;// Reset the count
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int n= s.nextInt(); // Arr1 ka Size
      int m= s.nextInt(); // Arr2 ka Size
      int [] arr1= new int [n];
      int [] arr2= new int[m];
      
      for(int i=0; i<n;i++) {
    	  arr1[i]= s.nextInt();
      }
      for(int i=0; i<m;i++) {
    	  arr2[i]=s.nextInt();
      }
      countInArray(arr1, arr2);
      
      
	}

}
