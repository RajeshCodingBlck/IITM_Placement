package IITM_Test5;

import java.util.Scanner;

public class MazePath {
	
	static int global_count=0;
    
	public static int Print(int curr_r, int curr_c, 
			                 int des_r, int des_c, String ansSoFar) {
		
		
		if(curr_r== des_r  && curr_c ==des_c) {
			System.out.println(ansSoFar);
			global_count++;
			return 1;
		}
		
		if(curr_r> des_r || curr_c>des_c) {
			return 0;
		}
		
		int mera_count=0;
		// Vertical
		int chhota_ans1=Print(curr_r+1, curr_c, des_r, des_c, ansSoFar+"V");
		// Horizontal
		int chhota_ans2=Print(curr_r, curr_c+1, des_r, des_c, ansSoFar+"H");
	
	    mera_count=chhota_ans1+chhota_ans2;
	    return mera_count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int m= s.nextInt();
        
        int ans=Print(1,1,n, m, "");
        System.out.println(ans);
        System.out.println(global_count);
        
        
	}

}
