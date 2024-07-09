package Recursion3;

public class QuickSort {
    
  public static int Partition(int [] arr, int s, int e) {
		
		
		int pivot=arr[e];
		
		int index=s; // chhoti value kiske sath Swap Karna he uska index .
		
		for(int i=s; i<e;i++) {	
			if(arr[i]< pivot) {
				
				int temp= arr[index];
				arr[index]=arr[i];
				arr[i]=temp;
				index++;
			}else {
				continue;
			}
		}
		
		int temp= arr[index];
		arr[index]=pivot;
		arr[e]= temp;
		
		return index;
	}
	public static void QuickSort(int [] arr, int s, int e) {
		    
		     if(s>=e) {
		    	 return;
		     }
		
		    int index= Partition(arr, s, e); 
		    QuickSort(arr, s, index-1);
		    QuickSort(arr, index+1, e);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {3,1,7,6,4};
       QuickSort(arr, 0, arr.length-1);
       for(int i=0; i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
	}

}
