package Lec_3;

public class MaxProfit_BuyandSell {
   
	
	public static int maxProfit(int [] prices) {
		
		// Buy
		int overAllProfit=0;
		for(int buy=0; buy<prices.length;buy++) {	
			for(int sell= buy+1; sell<prices.length;sell++) {
			  
			  int curr_profit= prices[sell]- prices[buy];
			  System.out.println("Buy at "+ buy + " and sell at "+
			   sell + " and currPofit is "+ curr_profit);
			  
			  if(overAllProfit< curr_profit) {
				  overAllProfit=curr_profit;
			  }
			}
		}
		
		return overAllProfit;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] prices= {7,1,5,3,6,4};
     int overallProfit= maxProfit(prices);
     System.out.println(overallProfit);
	}

}
