package Lec_4;

import java.util.Scanner;

public class CarRunOrNot {
	public static void fun(int car_number){

		int sumOfEven=0;
		int sumOfOdd=0;

		while(car_number>0){
			int ld= car_number%10;
            if(ld%2 ==0){
				sumOfEven= sumOfEven+ld;
			}else{
				sumOfOdd= sumOfOdd+ld;
			}

          car_number= car_number/10;
		}
      
	  if(sumOfEven %4 ==0 || sumOfOdd%3==0){
		  System.out.println("Yes");
	  }else{
		   System.out.println("No");
	  }


	}
    public static void main(String args[]) {
       
	   Scanner s= new Scanner(System.in);
	   int number_of_car= s.nextInt();
	   for(int i=1; i<=number_of_car; i++){
		   int car_number= s.nextInt();
		   fun(car_number);
	   }
    }
}
