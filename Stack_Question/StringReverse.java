package Stack_Question;

import java.util.Scanner;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       String str= s.next();
       
//       System.out.println(str);
       
       Stack<Character> st= new Stack();
       
       for(int i=0; i<str.length();i++) {
    	   st.push(str.charAt(i));
       }
       
       while(st.size()>0) {
    	   System.out.print(st.pop());
       }
       
       
       
       
       
	}

}
