package Lec_4;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int [] arr) {
    	
    	// loop for rounds
    	for(int rounds =1; rounds< arr.length;rounds++) {
    		
    		//loop for adjcent
    		for(int adj=0; adj<arr.length-rounds; adj++) {
    			
    			if(arr[adj]> arr[adj+1]) {
    				
    				int temp= arr[adj];
    				arr[adj]=arr[adj+1];
    				arr[adj+1]=temp;
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int [] arr= new int [n];
        
        for(int i=0; i<n;i++) {
        	arr[i]= s.nextInt();
        }
        
        bubbleSort(arr);
        for(int i=0; i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        
	}

}
