package IITM_Test_2;

import java.util.*;
public class Tem_question {
    public static void main(String args[]) {
       Scanner s= new Scanner(System.in);
	   int  minF=s.nextInt();
	   int maxF= s.nextInt();
	   int step= s.nextInt();

	   for(int i=minF ; i<=maxF;i+=step){
		   int cel=  (5*(i-32))/9;
		   System.out.println(i + "\t"+ cel);
	   }
    }
}
