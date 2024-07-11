package TimeComplexity;

public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100000;
		
//		f(n) -> denote function which give total work  wrt n.
		
		for (int i = 1; i <= n; i += 1) {
			System.out.println("Hello");
		}
//		  f(n)= c*n
		// TC -> O(n)
		
		
		for (int i = 1; i <= n; i += 2) {
			System.out.println("Hello");
		}
		// f(n)= c*(n+1)/2
		// TC -> O(n)

		for (int i = 1; i <= n; i *= 2) {
			System.out.println("Hello");
		}
		// f(n)= c*(logn+1)
		// TC -> O(logn)
		
		
		for (int i = n; i >=1; i /= 2) {
			System.out.println("Hello");
		}
		
		int i=1;
		while(i<=n) {
			System.out.println("Hello");
			i=i*2;
			i=i*3;
		}
		
		
	
	
	}

}
