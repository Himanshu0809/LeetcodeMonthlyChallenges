package Leetcode30DayAprilChallenge;
public class binaryTreeMaximumPathSum {
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
//		public int maxPathSum(TreeNode root) {
//			int max[] = new int[1];
//			max[0] = Integer.MIN_VALUE;
//			maxSumPath(root, max);
//			return max[0];
//
//		}
//
//		public int maxSumPath(TreeNode root, int[] max) {
//			if (root == null) {
//				return 0;
//			}
//			int left = maxSumPath(root.left, max);
//			int right = maxSumPath(root.right, max);
//
//			int currMax = Math.max(root.val, Math.max(root.val + left, root.val + right));
//
//			max[0] = Math.max(max[0], Math.max(currMax, left + right + root.val));
//
//			return currMax;
//		}
//	}
}
