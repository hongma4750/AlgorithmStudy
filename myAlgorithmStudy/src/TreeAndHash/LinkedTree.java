package TreeAndHash;

public class LinkedTree {
	private TreeNode root;
	
	public TreeNode makeBT(TreeNode bt1, String data, TreeNode bt2){
		TreeNode root = new TreeNode();
		
		root.data=data;
		root.left=bt1;
		root.right=bt2;
		
		return root;
	}
	
	public void preorder(TreeNode root){
		if(root != null){
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void inorder(TreeNode root){
		if(root!=null){
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	public void postorder(TreeNode root){
		if(root !=null){
			postorder(root.right);
			postorder(root.left);
			System.out.println(root.data);
		}
	}
}
