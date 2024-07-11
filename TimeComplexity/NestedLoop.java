package TimeComplexity;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 int n=10000;
		for(int i=1; i<=n;i++) {
			
			for(int j=n; j>=1;j/=2) {
				System.out.println("Hello");
			}
		}
		
		for(int i=1; i<=n;i++) {	
			for(int j=1; j<=n; j+=i) {		
				System.out.println("hello");
			}
		}
		
		
		
		
	}

}
