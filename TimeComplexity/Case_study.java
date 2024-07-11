package TimeComplexity;

public class Case_study {
    
	
	public static void fun(int i, int n ) {
		
		if(i==n) {
			System.out.println("fun");
			return;
		}
		
		fun(++i, n);
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a=12;
		
		fun(1, 3);
		
//		int val=12;
//		if( val==13 && a++ ==13 ) {
//			System.out.println("Hello");
//		}
//		System.out.println(a);
		          // 12  -12=0
		//int ans= a++ - a + 13  - --a ;
		//System.out.println(ans);
		
		
		
	}

}
