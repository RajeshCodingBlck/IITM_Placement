package Stack_Question;

import java.util.Stack;

public class InsertAtBottom {

	public static void InsertAtBottom(Stack<Integer> st, int val) {
		Stack<Integer> temp= new Stack();
		while(st.size()>0) {
			int top= st.pop();
			temp.push(top);
		}
		st.push(val);
		while(temp.size()>0) {
			int top= temp.pop();
			st.push(top);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<Integer> st= new Stack();
       st.push(4);
       st.push(3);
       st.push(2);
       st.push(1);
       System.out.println(st);
       InsertAtBottom(st, 5);
       System.out.println(st);
       
	}

}
