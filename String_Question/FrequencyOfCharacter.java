package String_Question;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str="abbacdeh";
          
          int [] fre= new int[256];
          
          for(int i=0;i<str.length();i++) {
       
        	  char ch=str.charAt(i);
        	  int ascii= ch;
        	  fre[ascii]=fre[ascii]+1;
          }
          
          for(int i=0; i<fre.length;i++) {
        	  
        	  if(fre[i] >0) {
        		  char ch= (char)i;
        		  System.out.println(ch + "-> "+ fre[i]);
        		  
        	  }
          }
          
	}

}
