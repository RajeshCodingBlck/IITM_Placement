package MyTree_pkg;

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // 1 2 -1 -1 3 4 -1 -1 5 -1 -1 
		Tree t= new Tree();
		//Preorder(t.root);
		PrintallPath(t.root, "",0);
		System.out.println(overallMaxSum);
		
	}

}
