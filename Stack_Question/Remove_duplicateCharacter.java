package Stack_Question;

import java.util.Stack;

public class Remove_duplicateCharacter {

	
	public static void removeDuplicate(String str) {
		
           Stack<Character> st=new Stack();
           
           for(int i=0;i<str.length();i++) {
        	   
        	   if( st.size()>0 && str.charAt(i)== st.peek()) {
        		   st.pop();
        	   }else {
        		   st.push(str.charAt(i));
        	   }
           }
           
           //System.out.println(st);
           
           String ans="";
           
           while(st.size()>0) {
        	   
        	   ans= st.peek()+ ans;
        	   st.pop();
           }
           System.out.println(ans);
           
           
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="abbaca";
       removeDuplicate(str);
		
		
	}

}
