package MyTree_pkg;

import java.util.HashMap;
import java.util.LinkedList;

public class client {

	
	public static void Inorder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		Inorder(root.left);
		System.out.println(root.data);
		Inorder(root.right);
		
	}
	
	public static void PostOrder(TreeNode root) {
		
		
	}
	public static void Preorder(TreeNode root) {
		
		 if(root==null) {
			 return;
		 }
		
		System.out.print(root.data+ " , ");
		Preorder(root.left);
		Preorder(root.right);
		
		
	}
	static int overallMaxSum=0;
	public static void PrintallPath(TreeNode root, String ans,int sum) {
		
		  if(root==null) {
			 
			  return;
		  }
		  
		  if(root.left == null && root.right==null) {
			  System.out.print(ans+root.data+ "  -> ");
			  System.out.println("Path Sum is "+ (sum+ root.data));
			  overallMaxSum= Math.max(overallMaxSum, sum+ root.data);
			  return ;
		  }
		PrintallPath(root.left, ans+root.data, sum+root.data);
		PrintallPath(root.right, ans+root.data, sum+ root.data);
		
		 
		  
		 
	}
	
	public static void BFS(TreeNode root) {
		
		LinkedList<TreeNode> q= new LinkedList();
		
		q.add(root);
		
		while(q.size()>0) {
			
			// Remove the front Node
			  TreeNode rn= q.removeFirst();
			  
			// Work on remove Node
			  System.out.println(rn.data);
			// add the childrens
			  
			  if(rn.left !=null) {
				  q.addLast(rn.left);
			  }
			  
			  if(rn.right !=null) {
				  q.addLast(rn.right);
			  }
		}
		
		
	}
	
	public static void LeftView(TreeNode root, int level, HashMap<Integer, Integer> m) {
		
		if(root==null) {
			return ;
		}
		
		
		if(m.containsKey(level)==false) {
			m.put(level, root.data);
		}
		System.out.println(root.data+ " its level is "+ level);
		
		LeftView(root.left, level+1,m);
		LeftView(root.right, level+1,m);
	}
  public static void RightView(TreeNode root, int level, HashMap<Integer, Integer> m) {
		
		if(root==null) {
			return ;
		}
		
		
		m.put(level, root.data);
		
		System.out.println(root.data+ " its level is "+ level);
		
		LeftView(root.left, level+1,m);
		LeftView(root.right, level+1,m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // 1 2 -1 -1 3 4 -1 -1 5 -1 -1 
		Tree t= new Tree();
		//Preorder(t.root);
		//PrintallPath(t.root, "",0);
		//System.out.println(overallMaxSum);
		BFS(t.root);
		HashMap<Integer,Integer> m= new HashMap();
		// 1 3 100 -1 6 7 8 -1 -1 9 -1 -1 -1 -1 10 -1 -1
		LeftView(t.root,0,m);
		
		for( Integer key  :  m.keySet()) {
			System.out.println(m.get(key));
		}
		
	}

}
