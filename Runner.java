package treePreOrderTraversal;

public class Runner {

	public static void main(String[] args) {
		 BinaryTree tree = new BinaryTree();
		 tree.insert(9);
		 tree.insert(10);
		 tree.insert(19);
		 tree.insert(2);
		 tree.insert(1);
		 tree.insert(7);
		 
		 tree.preOrder();

	}

}
