package TreeAndHash;

public class BinarySearchTree {

	private TreeNode1 root = new TreeNode1();
	
	public TreeNode1 insertKey(TreeNode1 root, char x){
		TreeNode1 p = root;
		TreeNode1 newNode = new TreeNode1();
		
		newNode.data=x;
		newNode.left=null;
		newNode.right=null;
		
		if(p==null){
			return newNode;
		}else if(newNode.data < p.data){
			p.left=insertKey(p.left, x);
			return p;
		}else if(newNode.data > p.data){
			p.right = insertKey(p.right, x);
			return p;
		}else{
			return p;
		}
	}
	
	public void insertBST(char x){
		root = insertKey(root,x);
	}
	
	public TreeNode1 searchBST(char x){
		TreeNode1 p = root;
		while(p !=null){
			if(x<p.data){
				p = p.left;
			}else if(x>p.data){
				p=p.right;
			}else{
				return p;
			}
			
			
		}
		return p;
	}
	
	public void inorder(TreeNode1 root){
		if(root != null){
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	public void preorder(TreeNode1 root){
		if(root != null){
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void printBST(){
		inorder(root);
		System.out.println();
	}
	
	public void printPre(){
		preorder(root);
	}
}
