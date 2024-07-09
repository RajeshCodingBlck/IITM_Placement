package Recursion3;

public class MergeSort {
   
	public static int[] Merge(int[] arr1, int[] arr2) {

		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int index = 0; // -> Ans array ke kis index par mughe value add karni he.
		int i = 0;
		int j = 0;

		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[index] = arr1[i];
				i++;
				index++;
			} else {
				ans[index] = arr2[j];
				index++;
				j++;
			}
		}

		// Agar arr1 ke element baach jay
		while (i < n) {
			ans[index] = arr1[i];
			i++;
			index++;
		}

		// Agar arr2 ke element baach jay
		while (j < m) {
			ans[index] = arr2[j];
			j++;
			index++;
		}
		return ans;

	}
	public static int [] MergeSort(int [] arr, int low, int high) {
		
		
		if(low>=high) {
			
			int [] base_ans= new int[1];
			base_ans[0]= arr[low];
			return base_ans;
		}
		
		int mid= (low+ high)/2;
		int [] left_arr= MergeSort(arr, low, mid);
		int [] right_arr= MergeSort(arr, mid+1, high);
		
		 int [] ans= Merge(left_arr, right_arr);
		 
		 return ans;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int [] arr= {7,5,1,3,6,4};
		
		int [] ans= MergeSort(arr,0, arr.length-1);
		
		//System.out.println(ans);
		for(int i=0; i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
