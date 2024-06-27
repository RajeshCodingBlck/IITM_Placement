package Lec_4;

public class Minimum_index_inarray {
    
public static int MinimumIndex(int [] arr, int s, int e) {
		
		int min_value=arr[s];
		int index=s;
		
		for(int i=s+1;i<=e;i++) {
			
			if(min_value> arr[i]) {
				min_value=arr[i];
				index=i;
			}
		}
		return index;
	}

	public static int MinimumIndex(int [] arr) {
		
		int min_value=arr[0];
		int index=0;
		
		for(int i=1;i< arr.length;i++) {
			
			if(min_value> arr[i]) {
				min_value=arr[i];
				index=i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {3,2,5,7,1,10};
         System.out.println(MinimumIndex(arr));
	}

}
