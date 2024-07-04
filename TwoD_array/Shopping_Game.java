import java.util.*;
public class Shopping_Game {
	public static void getWinner(int m, int n){

		int turn=1;
         int total_aayush=0;
		 int total_harshit=0;
		while(true){
            
			if(turn%2==0){ // Harshit

			 if(total_harshit+ turn<= n){
				   total_harshit+=turn;
			   }else{
				   System.out.println("Aayush");
				   break;
			   }

			}else{ // Aayush
               
			   if(total_aayush+ turn<= m){
				   total_aayush+=turn;
			   }else{
				   System.out.println("Harshit");
				   break;
			   }
			}
			turn++;
		}
	}
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
		int t= s.nextInt();
      for(int i=1; i<=t;i++){
         
		 int m= s.nextInt(); // Aayush
		 int n= s.nextInt();

		 getWinner(m, n);

	  }
    }
}