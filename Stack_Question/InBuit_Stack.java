package Stack_Question;

import java.util.Stack;

public class InBuit_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stack<Integer> st=new Stack();
         
         st.push(23);
         st.push(45);
         st.push(67);
         System.out.println(st.peek());
         //System.out.println(st.pop());
         //System.out.println(st.peek());
         System.out.println(st.size());
         System.out.println(st.isEmpty());
         
         
	}

}
