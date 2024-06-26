package Lec_3;

public class Buy_And_Sell_Profit {

	 public static int maxProfit(int [] prices) {
		 
		 int minSoFar_for_buy=prices[0];
		 int overAllmaxProfit=0;
		 for(int sell=1 ; sell< prices.length;sell++) {
			 
			 int curr_profit= prices[sell]-minSoFar_for_buy;
			 
			 if(overAllmaxProfit< curr_profit) {
				 overAllmaxProfit=curr_profit;
			 }
			 
			 minSoFar_for_buy= Math.min(prices[sell], minSoFar_for_buy);
		 }
		 
		 return overAllmaxProfit;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] prices= {7,1,5,3,6,4};
//     int overallProfit= maxProfit(prices);
//     System.out.println(overallProfit);
      
        int a=12;
        int b=34;
        
        System.out.println(Math.sqrt(a));
	}

}
