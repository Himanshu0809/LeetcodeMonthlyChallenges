package LeetcodeJuneChallenge;

public class sumRootToLeafNumbers {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
//	class Solution {
//		public int sumNumbers(TreeNode root) {
//			return findSum(root, 0);
//		}
//
//		public int findSum(TreeNode root, int total) {
//			if (root == null) {
//				return 0;
//			}
//			if (root.left == null && root.right == null) {
//				return total * 10 + root.val;
//			}
//			return findSum(root.left, total * 10 + root.val) + findSum(root.right, total * 10 + root.val);
//		}
//	}
}
