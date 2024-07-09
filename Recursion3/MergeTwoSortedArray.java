package Recursion3;

import java.util.Arrays;

public class MergeTwoSortedArray {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr1= {1,2,3,4,5};
        int [] arr2= {2,3,4,5,6,12};
        
        int [] ans= Merge(arr1, arr2);
//        System.out.println(ans);
      
        for(int i=0; i<ans.length;i++) {
        	
        	System.out.print(ans[i]+" ");
        }
        
        Arrays.sort(arr1);
        
	}

}
