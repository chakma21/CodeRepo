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
class Solution {
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root==null) return 0;
        helper(root);
        return maxsum;
    }
    public int helper(TreeNode root){
        int left=(root.left!=null)?Math.max(0,helper(root.left)):0;
        int right=(root.right!=null)?Math.max(0,helper(root.right)):0;
        int current= left+right+root.val;
        maxsum=Math.max(maxsum, current);
        return root.val+Math.max(left,right);
    }
}