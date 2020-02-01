/**
 * 
 */
package com.ramana.datastructures.trees.practice;

/**
 * @author RamanaGorle
 *
 */
public class BalancedTreeWithSortedArray {
	public static TreeNode root;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 0, 5, 13, 19, 22, 41, 55, 68, 72, 81, 98 };
		root = balancedBinaryTree(arr, 0, arr.length - 1);
		System.out.println("Pre order: ");
		preOrder(root);
		System.out.println();
		System.out.println("Post order: ");
		postOrder(root);
		System.out.println();
		System.out.println("In order: ");
		inOrder(root);
	}

	private static void preOrder(TreeNode root2) {
		if (root2 == null) {
			return;
		}
		System.out.print(root2.data+" ");
		preOrder(root2.left);
		preOrder(root2.right);
	}

	private static void postOrder(TreeNode root2) {
		if (root2 == null) {
			return;
		}
		postOrder(root2.left);
		postOrder(root2.right);
		System.out.print(root2.data+" ");
	}
	
	public static void inOrder(TreeNode root2) {
		if (root2 == null) {
			return;
		}
		inOrder(root2.left);
		System.out.print(root2.data+" ");
		inOrder(root2.right);
	}
	
	private static TreeNode balancedBinaryTree(int[] arr, int i, int j) {
		if (i > j) {
			return null;
		}
		int mid = (i + j) / 2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = balancedBinaryTree(arr, i, mid - 1);
		node.right = balancedBinaryTree(arr, mid + 1, j);
		return node;
	}

}