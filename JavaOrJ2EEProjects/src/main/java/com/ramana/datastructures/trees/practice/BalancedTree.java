/**
 * 
 */
package com.ramana.datastructures.trees.practice;

/**
 * @author RamanaGorle
 *
 */
public class BalancedTree {

	TreeNode root;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BalancedTree tree = new BalancedTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.left.left.left = new TreeNode(8);
		if (tree.isBalanced(tree.root))
			System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");
	}

	private boolean isBalanced(TreeNode root) {

		if (root == null) {
			return true;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		if (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
			return true;
		}
		return false;
	}

	private int height(TreeNode node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(height(node.left), height(node.right));
	}

}

class TreeNode {
	TreeNode left, right;
	int data;

	public TreeNode(int d) {
		this.data = d;
		left = right = null;
	}
}