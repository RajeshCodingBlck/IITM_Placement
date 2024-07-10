package TimeComplexity;

public class Algo1_withForLoop {
    
	public static int Sum(int n) {
		
		int sum=0;
		for(int i=1; i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 
		long  StartTimming= System.nanoTime();
		System.out.println(Sum(10000));
		long endTimming= System.nanoTime();
		System.out.println(endTimming-StartTimming);
		
	}

}
