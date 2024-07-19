package Stack_Question;

import java.util.*;

public class InsertAtBottom_usingRecursion {
   
	public static void InsertAtBottom(Stack<Integer> st, int val) {
		
		 if(st.size()==0) {
			 
			 st.push(val);
			 return;
		 }
		
		int top_element= st.pop();
		InsertAtBottom(st, val);
		st.push(top_element);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
       Stack<Integer> st= new Stack();
       
       int n= s.nextInt(); // Number of input
       
       for(int i=1; i<=n;i++) {
    	   
    	   int val= s.nextInt();
    	   st.push(val);
       }
      
       System.out.println(st);
       InsertAtBottom(st,5);
       System.out.println(st);
	}

}
