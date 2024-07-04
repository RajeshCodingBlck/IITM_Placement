package String_Question;

public class GoodString {
   
	public static boolean check(String str) {
		
		for(int i=0; i<str.length();i++) {
			
			char ch= str.charAt(i);
			if(ch=='a' ||
			   ch=='e' ||
			   ch=='i' ||
			   ch=='o' ||
			   ch=='u') {
				continue;
			}else {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="aeghiouegh";
       
       int overallMax=0;
       for(int i=0; i<str.length();i++) {
    	   for(int j=i; j<str.length();j++) {
    		   
    		//System.out.println(str.substring(i,j+1));   
    		   
    		   if(check(str.substring(i,j+1))==true) {
    			   System.out.print(str.substring(i,j+1));
    			   String currstr= str.substring(i,j+1);
    			   System.out.println(" , "+currstr.length());
    			   overallMax= Math.max(overallMax, currstr.length());
    		   }
    		   
    	   }
    	   
       }
       System.out.println(overallMax);
       
	}

}
