package Leetcode30DayAprilChallenge;
public class constructBSTFromPreorderTraversal {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */


//	class Solution {
//	    
//	    public int index=0;
//	    
//	    public TreeNode bstFromPreorder(int[] preorder) {
//	        TreeNode root=null;
//	        index=0;
//	        root=constructBST(preorder, 0, preorder.length-1, preorder.length );
//	        return root;
//	    }
//	    
//	    public TreeNode constructBST(int[] preorder, int low, int high, int size){
//	        if(index>=size||low>high){
//	            return null;
//	        }
//	        TreeNode root=new TreeNode(preorder[index]);
//	        index++;
//	        
//	        if(low==high){
//	            return root;
//	        }
//	        
//	        int i=low;
//	        for(i=low;i<=high;i++){
//	            if(preorder[i]>root.val){
//	                break;
//	            }
//	        }
//	        root.left=constructBST(preorder, index, i-1,size );
//	        root.right=constructBST(preorder, i, high, size);
//	        return root;  
//	    }
//	}
}
