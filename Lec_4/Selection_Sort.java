package Lec_4;

public class Selection_Sort {

	public static int MinimumIndex(int[] arr, int s, int e) {

		int min_value = arr[s];
		int index = s;

		for (int i = s + 1; i <= e; i++) {

			if (min_value > arr[i]) {
				min_value = arr[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr = {6,3,1,10,7};
     
     for(int i=0;i<arr.length;i++) {
    	  
    	int minIndex= MinimumIndex(arr,i, arr.length-1);
    	
    	int temp= arr[i];
    	arr[i]=arr[minIndex];
    	arr[minIndex]=temp;
     }
      for(int i=0; i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
	}

}
