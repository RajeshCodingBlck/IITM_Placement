package Lec_6;

import java.util.Scanner;

public class equation_solver {
   
	public static int BS(int n) {
		int low=1;
		int high=n;
		int pc_ans=-1;
		while(low<=high){
			int mid=(low+high)/2;
			
			if(mid*mid<=n) {
				pc_ans=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
			
		}
		return pc_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     int n= s.nextInt();
     System.out.println(BS(n));
	}

}
