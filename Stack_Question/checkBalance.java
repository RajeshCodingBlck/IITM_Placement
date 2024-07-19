package Stack_Question;

import java.util.Stack;

public class checkBalance {
    
	public static boolean checkBalance(String str) {
		
		Stack<Character> st=new Stack();
		
		for(int i=0; i<str.length();i++){
			
			char ch= str.charAt(i);
			
			if(ch=='(') {
				st.push('(');	
			}else {
				// closing
//				Pair opening ke sath Pair karna he.
				
				if(st.size()==0) {
					return false;
				}
				st.pop();
			}
		}
		
		if(st.size()==0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
