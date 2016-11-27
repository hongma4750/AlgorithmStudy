package TreeAndHash;

public class SearchMainClass {

	public static void main(String[] args) {
		BinarySearchTree bsT = new BinarySearchTree();
		
		bsT.insertBST('g');
		bsT.insertBST('i');
		bsT.insertBST('h');
		bsT.insertBST('d');
		bsT.insertBST('b');
		bsT.insertBST('m');
		bsT.insertBST('n');
		bsT.insertBST('a');
		bsT.insertBST('j');
		bsT.insertBST('e');
		bsT.insertBST('q');
		
		bsT.printBST();
		System.out.println("---------------------------------------");
		bsT.printPre();
		
		TreeNode1 p1 = bsT.searchBST('a');
		if(p1 != null){
			System.out.println(p1.data);
		}else{
			System.out.println("노자료");
		}
		
		TreeNode1 p2 = bsT.searchBST('ㅋ');
		if(p2 != null){
			System.out.println(p2.data);
		}else{
			System.out.println("노자료");
		}

	}

}
