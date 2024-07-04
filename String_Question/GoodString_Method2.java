 package String_Question;

public class GoodString_Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="aaaaa";
		 
		 int curr_count=0;
		 int overallLength=0;
		 
		 for(int i=0; i<str.length();i++) {
			 char ch= str.charAt(i);
				if(ch=='a' ||
				   ch=='e' ||
				   ch=='i' ||
				   ch=='o' ||
				   ch=='u') {
					
					curr_count++;
				}else {
					overallLength= Math.max(overallLength, curr_count);
					
					curr_count=0;
				}
		 }
		 overallLength= Math.max(overallLength, curr_count);
		 System.out.println(overallLength);
	}

}
