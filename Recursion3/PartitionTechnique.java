package Recursion3;

public class PartitionTechnique {
   
	public static int Partition(int [] arr) {
		
		
		int pivot=arr[arr.length-1];
		
		int index=0; // chhoti value kiske sath Swap Karna he uska index .
		
		for(int i=0; i<arr.length-1;i++) {	
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
		arr[arr.length-1]= temp;
		
		return index;
	}
	
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int [] arr= {3,1,6,7,2,4};
		int PivotIndex= Partition(arr);
		System.out.println(PivotIndex);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
