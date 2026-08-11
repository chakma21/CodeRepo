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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null) return new ArrayList<>();
        int level=0;
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        q.offer(root);
        while (!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int s=q.size();
            while (s>0){
                TreeNode node=q.poll();
                list.add(node.val);
                if (node.left!=null) q.offer(node.left);
                if (node.right!=null) q.offer(node.right);
                s--;
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
        
    }
}