package Stack_Question;

import java.util.*;

public class ReverseTheStack {
    
	
	public static void reverseTheStack(Stack<Integer> st) {
		
		  
		if(st.size()==0) {
			
			return;
		}
		int topElement= st.pop();
		reverseTheStack(st);
		InsertAtBottom_usingRecursion.InsertAtBottom(st, topElement);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
