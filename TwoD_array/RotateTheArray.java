package TwoD_array;
//https://leetcode.com/problems/rotate-image/
//Rotate The Matrix
class Solution {
    public void Transpose(int [][] arr){

        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr[0].length;j++){
                int temp= arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public void reverse(int [] arr){

        int i=0;
        int j=arr.length-1;
        while(i<=j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        Transpose(matrix);

        for(int i=0; i<matrix.length;i++){

            reverse(matrix[i]);
        }

    }
}
public class RotateTheArray {

}
