package IITM_Test_3;

public class countPalidromic {
     
	public static boolean check(String str) {
		

		int i = 0;
		int j = str.length() - 1;

		while (i <= j) {

			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);

			if (ch1 == ch2) {
				i++;
				j--;
			} else {
				return false;
			}

		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str="abacdad";
       
          int overallCount=0;
      for(int st=0; st<str.length();st++) {
    	
    	  for(int ed= st; ed<str.length();ed++) {
    		  
    		  String substring= str.substring(st, ed+1);
    		  
    		  if(check(substring)==true) {
    			  System.out.println(substring);
    			  overallCount++;
    		  }
    		  //System.out.println(substring);
    	  }
    	  
      }
      
      System.out.println(overallCount);
	}

}
