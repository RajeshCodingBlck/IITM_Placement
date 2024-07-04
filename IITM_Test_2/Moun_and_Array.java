package IITM_Test_2;

import java.util.Scanner;

public class Moun_and_Array {

	public static void Input(int [] arr, Scanner s) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
	}
	public static void display(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int minAbsluteDifference(int [] arr1,
			int [] arr2, int [] arr3) {
		
		int OverallMin= Integer.MAX_VALUE;
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr2.length;j++) {	
				for(int k=0; k<arr3.length;k++) {
					int a=arr1[i];
					int b=arr2[j];
					int c= arr3[k];
					int minVal= Math.min(a, Math.min(b, c));
					int maxVal= Math.max(a, Math.max(b, c));
					
					int currdiff=maxVal-minVal;
					System.out.println(a+ " ,"+ b+ " ,"+c+ " ,"+"Min Diff "+currdiff);
				    OverallMin= Math.min(currdiff,OverallMin );
				}
			}
		}
		
		return OverallMin;
	}
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int n1= s.nextInt(); // Array1 ka Size
		int n2= s.nextInt(); // Array2 ka Size
		int n3= s.nextInt(); // Array3 ka Size
		
		int [] arr1= new int[n1];
		int [] arr2= new int[n2];
		int [] arr3= new int[n3];
		
		Input(arr1, s);
		Input(arr2, s);
		Input(arr3,s);
		
		display(arr1);
		display(arr2);
		display(arr3);
		
		int ans= minAbsluteDifference(arr1, arr2, arr3);
		System.out.println(ans);
	}
}
