package Recursion2;

public class ReverseTheArray {
    
	//  Array ko Reverse i se lekar j taak.
	public static void reverse(int [] arr, int i, int j) {
		   if(i>j) { // Array is Empty
			   return;
		   }
		
		// subProblem
		reverse(arr, i+1, j-1);
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,2,3,4,5,6};
     reverse(arr, 0, arr.length-1);
     
     for(int i=0; i<arr.length;i++) {
    	 System.out.print(arr[i]+ " ");
     }
	}

}
