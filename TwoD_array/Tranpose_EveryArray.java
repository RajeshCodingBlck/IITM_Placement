package TwoD_array;
// Leetcode Code - Tranpose leetcode Number 867.
class Solution {
    public int[][] transpose(int[][] matrix) {

        int rows= matrix.length;
        int cols= matrix[0].length;

        int [][] tranpose= new int [cols][rows];

        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){

                tranpose[j][i]=matrix[i][j]
            }
        }
        return transpose;
    }
}
public class Tranpose_EveryArray {

}
